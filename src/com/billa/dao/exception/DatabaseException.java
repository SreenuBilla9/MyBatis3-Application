package com.billa.dao.exception;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}

	public DatabaseException() {
		super();
	}

	public DatabaseException(Throwable t) {
		super(t);
	}

}
