package com.qtz.ht.session.spi.user.vo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.dto.VO;
/**
 * <p>Title:HtStaff</p>
 * <p>Description:海淘员工表VO类</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author tanglijun
 * @version v1.0 2016-04-07
 */
public class HtStaff extends VO<Long> implements java.io.Serializable {
	
	/**类的版本号*/
	private static final long serialVersionUID = 1609896795703296L;
	/** 平台钱包为信息id*/
	public static final long ADMIN_WALLET_ID = 1000l;
	
		return ToStringBuilder.reflectionToString(this);
	}
}