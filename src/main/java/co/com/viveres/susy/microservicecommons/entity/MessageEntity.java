package co.com.viveres.susy.microservicecommons.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MESSAGES")
public class MessageEntity {

	@Id
	@Column(name = "CODIGO")
	private String code;
	@Column(name = "DESCRIPCION")
	private String descripction;
	@Column(name = "CODIGO_MENSAJE")
	private String codeMessage;

}
