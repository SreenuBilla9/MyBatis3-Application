package com.billa.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class TransactionDTO implements Serializable {

	private Long transId;
	private Long fromAccId;
	private String username;

	private Long toAcId;

	private double transAmount;
	private Date transDate;
	private String status;

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public Long getFromAccId() {
		return fromAccId;
	}

	public void setFromAccId(Long fromAccId) {
		this.fromAccId = fromAccId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getToAcId() {
		return toAcId;
	}

	public void setToAcId(Long toAcId) {
		this.toAcId = toAcId;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
