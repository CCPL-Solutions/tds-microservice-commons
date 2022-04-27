package co.com.viveres.susy.microservicecommons.exceptions;

import co.com.viveres.susy.microservicecommons.entity.MessageEntity;

public class GenericException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private final MessageEntity messageEntity;

	public GenericException(MessageEntity messageEntity) {
		super();
		this.messageEntity = messageEntity;
	}

	public MessageEntity getMessageEntity() {
		return messageEntity;
	}	
	
}
