package com.qtz.ht.service.system.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qtz.base.common.ExceptionConstants;
import com.qtz.base.dao.BizDao;
import com.qtz.base.exception.ServiceException;
import com.qtz.base.service.impl.BaseServiceImpl;
import com.qtz.base.util.StringUtil;
import com.qtz.ht.service.system.dao.HtFloorDao;
import com.qtz.ht.spi.good.service.HtStaffGoodsService;
import com.qtz.ht.spi.good.vo.HtStaffGoods;
import com.qtz.ht.spi.system.service.HtFloorGoodsService;
import com.qtz.ht.spi.system.service.HtFloorService;
import com.qtz.ht.spi.system.vo.HtFloor;
import com.qtz.ht.spi.system.vo.HtFloorGoods;
import com.qtz.id.spi.IdService;


/**
 * <p>Title:HtFloorServiceImpl</p>
 * <p>Description:楼层管理表服务实现类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-08-08
 */
@Service("htFloorServiceImpl")
public class HtFloorServiceImpl extends BaseServiceImpl<HtFloor,Long> implements HtFloorService  {
	/**初始化日志对象*/
//	private static Logger log = Logger.getLogger(HtFloorServiceImpl.class);
	/**注入楼层管理表DAO接口类*/
	@Resource(name="htFloorDaoImpl")
    private HtFloorDao dao;
	@Resource(name="htFloorGoodsServiceImpl")
	private HtFloorGoodsService htFloorGoodsService;
	@Resource(name="htStaffGoodsServiceImpl")
	private HtStaffGoodsService htStaffGoodsService;
	@Resource(name = "idServiceImpl")
	private IdService idService;
	
	/** 
	* 【取得】业务DAO对象
	* @return 	业务DAO对象  
	*/
	@Override
	protected BizDao<HtFloor,Long> getDao() {
		return dao;
	}

	@Override
	public HtFloor addVo(HtFloor vo) throws ServiceException {
			if (null == vo.getDmId()) vo.setDmId(idService.generateId());
		return super.addVo(vo);
	}

	@Override
	public void addList(List<HtFloor> list) throws ServiceException {
		for (HtFloor vo : list) {
				if (null == vo.getDmId()) vo.setDmId(idService.generateId());
		}
		super.addList(list);
	}
	
	@Override
	public int add(HtFloor htFloor) throws ServiceException {
		floorValidation(htFloor);
		HtFloor floor=new HtFloor();
		floor.setCategoryId(htFloor.getCategoryId());
		floor.setSortNumber(htFloor.getSortNumber());
		List<HtFloor> list=super.findList(floor); 
		if(htFloor.getDmId()==null||htFloor.getDmId()<1)
		{
			htFloor.setDmId(idService.generateId());
		}
		if(list!=null&&list.size()>0){
			throw new ServiceException(ExceptionConstants.ERRORCODE_7, "楼层序号已用，请选择其他楼层！");
		}
		this.addVo(htFloor);//楼层保存
		floor.setSortNumber(null);
		return super.findList(floor).size();
	}
	
	/**
	* 【新增或编辑楼层参数验证】
	* @param htFloor
	* @throws ServiceException  
	*/
	public void floorValidation(HtFloor htFloor)throws ServiceException{
		if(htFloor.getFloorName()==null&&"".equals(htFloor.getFloorName())){
			throw new ServiceException(ExceptionConstants.ERRORCODE_7, "楼层名称不能为空");
		}
		if(htFloor.getFloorName().trim().length()<2||htFloor.getFloorName().trim().length()>6){
			throw new ServiceException(ExceptionConstants.ERRORCODE_7, "楼层名称字数2-6之间");
		}
		if(htFloor.getSortNumber()==null){
			throw new ServiceException(ExceptionConstants.ERRORCODE_7, "楼层序号不能为空");
		}
		if(htFloor.getIsValid()==null){
			throw new ServiceException(ExceptionConstants.ERRORCODE_7, "请选择楼层状态");
		}
	}

	@Override
	public void statesMov(HtFloor htFloor) throws ServiceException {
		super.modVoNotNull(htFloor);
	}
	@Override
	public List<HtFloorGoods> findFloorGoodsByFloorId(Long floorId) throws ServiceException {
		HtFloorGoods vo=new HtFloorGoods(); 
		vo.setLinkUrl(floorId);
		List<HtFloorGoods> htFloorGoodsList=htFloorGoodsService.findList(vo);//查询楼层下所有商品
		HtStaffGoods htStaffGoods=new HtStaffGoods();
		if(htFloorGoodsList!=null&&htFloorGoodsList.size()>0){
			for (HtFloorGoods htFloorGoods : htFloorGoodsList) {
				htStaffGoods.setDmId(htFloorGoods.getGoodId());
				htStaffGoods=htStaffGoodsService.findVo(htStaffGoods.getDmId(), htStaffGoods);//查询商品
				if(!StringUtil.isEmpty(htFloorGoods))
					htFloorGoods.setGoodName(htStaffGoods.getGoodName());;
			}
		}
		return htFloorGoodsList;
	}
	@Override
	public void mod(HtFloor htFloor) throws ServiceException {
		floorValidation(htFloor);
		HtFloor floor=new HtFloor();
		floor.setCategoryId(htFloor.getCategoryId());
		floor.setSortNumber(htFloor.getSortNumber());
		List<HtFloor> list=super.findList(floor);
		if(list!=null&&list.size()>0){
			for(HtFloor hf:list){
				if(hf.getDmId().longValue()!=htFloor.getDmId().longValue()){
					throw new ServiceException(ExceptionConstants.ERRORCODE_7, "楼层序号已用，请选择其他楼层！");
				}
			}
		}
		super.modVoNotNull(htFloor);//楼层保存
	}
}