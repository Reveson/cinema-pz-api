package com.example.cinema.cinemapz.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class RestApiErrorAttributes {

	private String status;
	private String timestamp;
	private String message;
	private String debugMessage;

	public RestApiErrorAttributes() {}

	public RestApiErrorAttributes(HttpStatus status, Exception exception) {
		this(status, ErrorCode.UNEXPECTED_ERROR.name(), exception);
	}

	public RestApiErrorAttributes(HttpStatus status, String message, Exception exception) {
		this.status = status.toString();
		this.message = message;
		this.debugMessage = exception.getLocalizedMessage();
		this.timestamp = LocalDateTime.now().toString();
	}

	public String getStatus() {
		return status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDebugMessage() {
		return debugMessage;
	}

	@Override
	public String toString() {
		return "RestApiErrorAttributes{" + "status=" + status + ", timestamp=" + timestamp + ", message='" + message + '\''
				+ ", debugMessage='" + debugMessage + '\'' + '}';
	}

}
