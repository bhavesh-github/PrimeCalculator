package com.nw.primenum.entity;

import java.util.TreeSet;

public class ResponseData {
	
	private String errorMessage;
	private int statusCode;
	private boolean success;
	private TreeSet<Integer> data;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public TreeSet<Integer> getData() {
		return data;
	}
	public void setData(TreeSet<Integer> data) {
		this.data = data;
	}
	
	
	
}
