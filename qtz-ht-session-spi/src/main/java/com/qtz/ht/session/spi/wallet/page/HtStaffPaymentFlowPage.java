package com.qtz.ht.session.spi.wallet.page;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.common.Pager;
import com.qtz.ht.session.spi.wallet.vo.HtStaffPaymentFlow;
/**
 * <p>Title:HtStaffPaymentFlowPage</p>
 * <p>Description:商户货款流水分页类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-04-28
 */
public class HtStaffPaymentFlowPage extends Pager<HtStaffPaymentFlow,Long> implements Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1639294647191553L;
	
	private Long dmId;
		/** 商户信息id */
	private Long busiId;
	/** 订单id */
	private Long orderId;
	/** 金额 */
	private Double amount;
	/** 平台收入 */
	private Double platformRevenue;
	/** 供应商收入 */
	private Double staffRevenue;
	/** 支付类型 */
	private Integer paymentType;
	/** 平台扣点 */
	private Double platformPoints;
	/** 入账时间 */
	private Long incomeTime;
	/** 解冻时间 */
	private Long releaseTime;
	/** 对账状态:0完成,1冻结中 */
	private Integer recoStatus;
	/** 操作时间 */
	private Long crtime;
	/** 开始时间 */
	private Long startTime;
	/** 结束时间 */
	private Long endTime;
		public Long getDmId() {	    return this.dmId;	}	public void setDmId(Long dmId) {	    this.dmId=dmId;	}
	public Long getBusiId() {
	    return this.busiId;
	}
	public void setBusiId(Long busiId) {
	    this.busiId=busiId;
	}	public Long getOrderId() {	    return this.orderId;	}	public void setOrderId(Long orderId) {	    this.orderId=orderId;	}	public Double getAmount() {	    return this.amount;	}	public void setAmount(Double amount) {	    this.amount=amount;	}	public Double getPlatformRevenue() {	    return this.platformRevenue;	}	public void setPlatformRevenue(Double platformRevenue) {	    this.platformRevenue=platformRevenue;	}	public Double getStaffRevenue() {	    return this.staffRevenue;	}	public void setStaffRevenue(Double staffRevenue) {	    this.staffRevenue=staffRevenue;	}	public Integer getPaymentType() {	    return this.paymentType;	}	public void setPaymentType(Integer paymentType) {	    this.paymentType=paymentType;	}	public Double getPlatformPoints() {	    return this.platformPoints;	}	public void setPlatformPoints(Double platformPoints) {	    this.platformPoints=platformPoints;	}	public Long getIncomeTime() {	    return this.incomeTime;	}	public void setIncomeTime(Long incomeTime) {	    this.incomeTime=incomeTime;	}	public Long getReleaseTime() {	    return this.releaseTime;	}	public void setReleaseTime(Long releaseTime) {	    this.releaseTime=releaseTime;	}	public Integer getRecoStatus() {	    return this.recoStatus;	}	public void setRecoStatus(Integer recoStatus) {	    this.recoStatus=recoStatus;	}	public Long getCrtime() {	    return this.crtime;	}	public void setCrtime(Long crtime) {	    this.crtime=crtime;	}	public Long getStartTime() {
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
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}