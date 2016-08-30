package com.qtz.ht.session.spi.user.page;


import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.common.Pager;
import com.qtz.ht.session.spi.user.vo.HtStaff;
/**
 * <p>Title:HtStaffPage</p>
 * <p>Description:海淘员工表分页类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-04-07
 */
public class HtStaffPage extends Pager<HtStaff,Long> implements java.io.Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1609896795703297L;
	
	private Long dmId;
	
		return ToStringBuilder.reflectionToString(this);
	}
}