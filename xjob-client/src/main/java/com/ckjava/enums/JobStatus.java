package com.ckjava.enums;

import org.apache.commons.lang3.builder.ToStringBuilder;

public enum JobStatus {
	EXECUTING(0, "正在执行"), FINISHED(1, "已完成"), UNKNOW(2, "未知状态");

	private int code;
	private String desc;

	private JobStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("code", code)
				.append("desc", desc)
				.toString();
	}
}
