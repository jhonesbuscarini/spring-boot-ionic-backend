package com.jhones.cursomc.services.execption;

public class DataIntegrityExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityExeption(String msg) {
		super(msg);
	}
	
	public DataIntegrityExeption(String msg, Throwable cause) {
		super(msg, cause);
	}
}
