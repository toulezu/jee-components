package com.ckjava.model;

import com.ckjava.enums.MethodFlag;

/**
 * 封装了 INVOKE, EXECUTING, TEST, STOP  http 请求中的参数信息
 *
 */
public class JobRequest implements java.io.Serializable {

	private static final long serialVersionUID = -4154061846821583761L;

	/**
	 * 对应 job_execute_log 表中的id
	 */
	private long jobDetailId;

	/**
	 * 需要执行的job的类的全路径名
	 */
	private String classFullPath;

	/**
	 * server端执行方法标记，值为 INVOKE、EXECUTING
	 */
	private MethodFlag methodFlag;

	/**
	 * 参数
	 */
	private String param;

	public long getJobDetailId() {
		return jobDetailId;
	}

	public void setJobDetailId(long jobDetailId) {
		this.jobDetailId = jobDetailId;
	}

	public String getClassFullPath() {
		return classFullPath;
	}

	public void setClassFullPath(String classFullPath) {
		this.classFullPath = classFullPath;
	}

	public MethodFlag getMethodFlag() {
		return methodFlag;
	}

	public void setMethodFlag(MethodFlag methodFlag) {
		this.methodFlag = methodFlag;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

}
