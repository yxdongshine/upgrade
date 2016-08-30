package com.qtz.ht.spi.rule.vo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.qtz.base.dto.VO;
/**
 * <p>Title:RuleProfit</p>
 * <p>Description:利润分配规则VO类</p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: 深圳市好实再商贸有限公司</p>
 * @author 李昌波 - changbo.li
 * @version v1.0 2015-09-23
 */
public class RuleProfit extends VO<Long> implements java.io.Serializable {
	
	/**类的版本号*/
	private static final long serialVersionUID = 1331121970137088L;
	
	private Long dmid;
	/** 规则code */
		return dmId;
	}
	public void setDmId(Long dmId) {
		this.dmId = dmId;
	}
	public String getCode() {
	public Long getDmid() {
		return dmid;
	}
	public void setDmid(Long dmid) {
		this.dmid = dmid;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}