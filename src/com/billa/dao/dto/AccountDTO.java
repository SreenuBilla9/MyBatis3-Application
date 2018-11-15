package com.billa.dao.dto;

import java.util.Date;

public class AccountDTO {

	private Long accountId;
	private String username;

	private String accounttype;
	private String branchcode;
	private String isactive;
	private String currency;

	private Date opendate;
	private Date closeddate;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	public Date getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(Date closeddate) {
		this.closeddate = closeddate;
	}

	@Override
	public String toString() {
		return "AccountDTO [accountId=" + accountId + ", username=" + username + ", accounttype=" + accounttype
				+ ", branchcode=" + branchcode + ", isactive=" + isactive + ", currency=" + currency + ", opendate="
				+ opendate + ", closeddate=" + closeddate + "]";
	}

}
