package in.ecgc.erp.pol_shd_rod_lm_exp_fe.dto;

import java.sql.Timestamp;
/**
 *Response DTO class
 *
 *@version 1.0
 *@Author Vaibhav Rane C-DAC Mumbai
 **/
public class ResponseDto {

	private boolean success;
	private Object data;
	private String message;
	private int code;
	private String details;
	private Timestamp timestamp;
	
	
	
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseDto(boolean success, Object data, String message, int code,String details, Timestamp timestamp) {
		super();
		this.success = success;
		this.data = data;
		this.message = message;
		this.code = code;
		this.details=details;
		this.timestamp = timestamp;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ResponseDto [success=" + success + ", data=" + data + ", message=" + message + ", code=" + code
				+ ", details=" + details + ", timestamp=" + timestamp + "]";
	}
}
