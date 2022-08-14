package co.com.viveres.susy.microservicecommons.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class NotificationDto{

	private String uuid;
	private LocalDateTime timeStamp;
	private String severity;
	private String code;
	private String message;
	private List<String> metadata;

}
