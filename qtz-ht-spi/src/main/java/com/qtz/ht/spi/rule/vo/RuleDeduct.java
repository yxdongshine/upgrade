package com.qtz.ht.spi.rule.vo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.dto.VO;
/**
 * <p>Title:RuleDeduct</p>
 * <p>Description:行业扣点规则VO类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author 李昌波 - changbo.li
 * @version v1.0 2015-09-23
 */
public class RuleDeduct extends VO<Long> implements java.io.Serializable {
	
	/**类的版本号*/
	private static final long serialVersionUID = 1331154682906624L;


	public Long getDmId() {
		return dmId;
	}
	@Override
	public void setDmId(Long dmId) {
		this.dmId = dmId;
	}
		return ToStringBuilder.reflectionToString(this);
	}
}