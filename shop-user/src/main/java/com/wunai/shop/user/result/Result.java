package com.wunai.shop.user.result;

public class Result<T> {
	private Integer code;
	private String msg;
	private T value;

	public Result(T value) {
		this.code = 0;
		this.value = value;
	}

	public Result(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getValue() {
		return value;
	}

}
