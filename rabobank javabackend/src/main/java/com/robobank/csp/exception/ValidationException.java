package com.robobank.csp.exception;

/**
 * @author NarayanaSwamy Thota
 *
 */
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = -9034905337171386170L;

	public ValidationException(String message) {
		super(message);
	}
}
