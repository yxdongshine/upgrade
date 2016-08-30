package com.qtz.ht.order.spi.order.page;
import com.qtz.base.common.Pager;
/**
 * <p>Title:OrderLogPage</p>
 * <p>Description:订单分页类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: 深圳市擎天柱信息科技有限公司</p>
 * @author 涂鑫 -xin.tu
 * @version v1.0 2015-09-22
 */
public class OrderLogPage extends Pager<com.qtz.ht.order.spi.order.vo.OrderLog,java.lang.Long> implements java.io.Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1329561157453825L;

	
	/**
	 * 备注
	 */
	private java.lang.String notes;
	
    return notes;
  }
  public void setNotes(java.lang.String notes) {
    this.notes = notes;
  }
  public String toString() {
}