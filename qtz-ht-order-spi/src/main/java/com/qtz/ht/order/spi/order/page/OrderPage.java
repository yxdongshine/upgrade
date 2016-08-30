package com.qtz.ht.order.spi.order.page;
import com.qtz.base.common.Pager;
/**
 * <p>Title:OrderPage</p>
 * <p>Description:订单分页类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * @author 涂鑫 -xin.tu
 * @version v1.0 2015-09-18
 */
public class OrderPage extends Pager<com.qtz.ht.order.spi.order.vo.HtOrder,java.lang.Long> implements java.io.Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1323933640427521L;

	
	
	/**
	 * 退款备注
	 */
	private String refundNote;
	
	/** 时间查询入参  (接收页面传递数据) 不与数据库交付 */
	private String orderstime;
	
	private String orderetime;
	
	private String paystime;
	
	private String payetime;
	
	/** **/
	/** 下单时间*/
	private Long orderStartTime;
	
	private Long orderEndTime;
	
	/** 支付成功时间*/
	private Long payStartTime;
	
	private Long payEndTime;
	
	private String paOrdersId;
	
	public String getPaOrdersId() {
		return paOrdersId;
	}
	public void setPaOrdersId(String paOrdersId) {
		this.paOrdersId = paOrdersId;
	}
	public java.lang.Long getDmId() {
	
		return refundNote;
	}
	public void setRefundNote(String refundNote) {
		this.refundNote = refundNote;
	}
	public Long getOrderStartTime() {
		return orderStartTime;
	}
	public void setOrderStartTime(Long orderStartTime) {
		this.orderStartTime = orderStartTime;
	}
	public Long getOrderEndTime() {
		return orderEndTime;
	}
	public void setOrderEndTime(Long orderEndTime) {
		this.orderEndTime = orderEndTime;
	}
	public Long getPayStartTime() {
		return payStartTime;
	}
	public void setPayStartTime(Long payStartTime) {
		this.payStartTime = payStartTime;
	}
	public Long getPayEndTime() {
		return payEndTime;
	}
	public void setPayEndTime(Long payEndTime) {
		this.payEndTime = payEndTime;
	}
	
	public String getOrderstime() {
		return orderstime;
	}
	public void setOrderstime(String orderstime) {
		this.orderstime = orderstime;
	}
	public String getOrderetime() {
		return orderetime;
	}
	public void setOrderetime(String orderetime) {
		this.orderetime = orderetime;
	}
	public String getPaystime() {
		return paystime;
	}
	public void setPaystime(String paystime) {
		this.paystime = paystime;
	}
	public String getPayetime() {
		return payetime;
	}
	public void setPayetime(String payetime) {
		this.payetime = payetime;
	}
	public String toString() {
}