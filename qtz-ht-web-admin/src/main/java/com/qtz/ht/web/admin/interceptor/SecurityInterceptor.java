package com.qtz.ht.web.admin.interceptor;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.qtz.base.dto.DdmSession;
import com.qtz.base.exception.ServiceException;
import com.qtz.base.response.RespJsonPHandler;
import com.qtz.base.response.RespMsg;
import com.qtz.base.util.Constants;
import com.qtz.ht.session.spi.session.service.SessionService;
import com.qtz.ht.session.spi.user.vo.HtStaff;


/**
 * 实现拦截器 
 * ClassName: SecurityInterceptor <br/> 
 * Function: TODO (). <br/> 
 * Reason: TODO (). <br/> 
 * date: 2016年5月27日 上午10:39:31 <br/> 
 * 
 * @author yxd 
 * @version
 */
public class SecurityInterceptor implements HandlerInterceptor{
	private static Logger log=Logger.getLogger(SecurityInterceptor.class);
	
	@Autowired
	private  SessionService sessionService = null;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws ServiceException, IOException{
		
		String sid = request.getParameter("token");
		if (StringUtils.isEmpty(sid)) {//不存在 提示登录
			RespJsonPHandler.respError(RespMsg.session_overdue, response, request);// session
			return false;
		}else {
			DdmSession appSession = sessionService.getSession(sid);	
			if (appSession == null) {
				RespJsonPHandler.respError(RespMsg.session_overdue, response, request);// session
				return false;
			}
			Object obj=appSession.getSessionObject(Constants.SESSION_USER);
			if(obj==null){
				log.info("登录信息  obj:["+obj+"]异常");
				return false;
			}
			if(obj instanceof HtStaff){
				HtStaff user = (HtStaff)obj;
				log.debug("+++++++++++++++++++++++");
				log.debug("拦截到请求  token  :"+sid+", USERID: [ " + user.getDmId()+ " ]"+",NAME: [ "+user.getName()+"]"+ ", IP: " + request.getRemoteAddr() + ", REQUESTURL: "+request.getRequestURL() + ",  USER-AGENT: " + request.getHeader("User-Agent") + ",  SESSIONID: "+appSession.getId() );
				log.debug("+++++++++++++++++++++++");
			}else{
				RespJsonPHandler.respError(RespMsg.session_overdue, response, request);// session
				return false;
			}
			
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
		
		String sid = request.getHeader("token");
		if (!StringUtils.isEmpty(sid)) {
			DdmSession appSession =  sessionService.getSession(sid);
			if (appSession != null) {
			   sessionService.saveSession(appSession);
			}
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}
}
