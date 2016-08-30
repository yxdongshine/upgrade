package com.qtz.ht.spi.system.vo;

import com.qtz.base.dto.VO;
import com.qtz.ht.spi.good.vo.HtStaffGoods;

/**
 * <p>Title:HtFloorGoods</p>
 * <p>Description:楼层关联商品VO类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-08-08
 */
public class HtFloorGoods extends VO<Long> implements java.io.Serializable {
	
	/**类的版本号*/
	private static final long serialVersionUID = 1783998156261376L;

	
	/**商品名称*/
	private String goodName;
	/**
	 * 返回后具体的商品细腻
	 */
	private HtStaffGoods htStaffGoods;
	
		return htStaffGoods;
	}
	public void setHtStaffGoods(HtStaffGoods htStaffGoods) {
		this.htStaffGoods = htStaffGoods;
	}
	public Long getDmId() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String toString() {
}