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
	
	public Long getBusiId() {
	    return this.busiId;
	}
	public void setBusiId(Long busiId) {
	    this.busiId=busiId;
	}
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