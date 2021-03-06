package com.qtz.ht.job.task.dao;
import com.qtz.base.dao.BizDao;
import com.qtz.base.exception.DaoException;
import com.qtz.ht.job.task.vo.HtStaffPaymentFlow;
/**
 * 
 *  * <p>Title:HtStaffPaymentFlowDao</p>
 * <p>Description:商户货款流水DAO接口类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * ClassName: HtStaffPaymentFlowDao <br/> 
 * Function: TODO (). <br/> 
 * Reason: TODO (). <br/> 
 * date: 2016年6月6日 上午9:26:21 <br/> 
 * 
 * @author yxd 
 * @version
 */
public interface HtStaffPaymentFlowDao extends BizDao<HtStaffPaymentFlow,Long> {
	
	public <T> void delDataByCondition(T vo)throws DaoException;
}