package com.dutch.module.exception;

public class GlobalException extends RuntimeException {
private String errorMsg;

public GlobalException(String errorMsg) {
	super(errorMsg);
	this.errorMsg = errorMsg;
}
	
}
