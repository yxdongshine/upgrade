package com.qtz.ht.spi.good.page;


import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.common.Pager;
import com.qtz.ht.spi.good.vo.HtStaffGoods;
/**
 * <p>Title:HtStaffGoodsPage</p>
 * <p>Description:商户商品操作记录分页类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-04-07
 */
public class HtStaffGoodsPage extends Pager<HtStaffGoods,Long> implements java.io.Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1609975852992513L;
	
	private Long dmId;
	
	/**
	 * 商品成本价格
	 */
	private Double finalPrice;
	/**
	 * 创建时间
	 */
	private Long startTime;
	private Long endTime;
	private Double startPrice;
	private Double endPrice;
	/**
	 * 上架开始时间
	 */
	private Long shelvesStartTime;
	private Long shelvesEndTime;
	
	
	public Double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public Double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	public Long getShelvesStartTime() {
		return shelvesStartTime;
	}
	public void setShelvesStartTime(Long shelvesStartTime) {
		this.shelvesStartTime = shelvesStartTime;
	}
	public Long getShelvesEndTime() {
		return shelvesEndTime;
	}
	public void setShelvesEndTime(Long shelvesEndTime) {
		this.shelvesEndTime = shelvesEndTime;
	}
	
}