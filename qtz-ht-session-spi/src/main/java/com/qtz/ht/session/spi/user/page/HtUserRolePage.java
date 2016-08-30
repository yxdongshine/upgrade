package com.qtz.ht.session.spi.user.page;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.common.Pager;
import com.qtz.ht.session.spi.user.vo.HtUserRole;
/**
 * <p>Title:HtUserRolePage</p>
 * <p>Description:商户用户与角色关联分页类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-01-25
 */
public class HtUserRolePage extends Pager<HtUserRole,Long> implements Serializable{

	/**类的版本号*/
	private static final long serialVersionUID = 1506688405342209L;

	
		return ToStringBuilder.reflectionToString(this);
	}
}