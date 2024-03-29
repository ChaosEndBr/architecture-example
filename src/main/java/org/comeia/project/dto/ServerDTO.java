package org.comeia.project.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.comeia.project.enumerator.ServerType;
import org.comeia.project.locale.MessagesMessageKeys;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("attributesFilter")
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
public @Data class ServerDTO implements Serializable {

	private Long id;
	
	@NotNull(message = MessagesMessageKeys.VALIDATE_SERVER_NAME_NOT_VALID)
	@Size(message = MessagesMessageKeys.VALIDATE_SERVER_NAME_NOT_LENGTH, min = 5, max = 60)
	private String Name;
	@NotNull(message = MessagesMessageKeys.VALIDATE_SERVER_PORT_NOT_VALID)
	@Size(message = MessagesMessageKeys.VALIDATE_SERVER_PORT_NOT_LENGTH, min = 5, max = 60)
	private String Port;
	@NotNull(message = MessagesMessageKeys.VALIDATE_SERVER_LOGIN_NOT_VALID)
	@Size(message = MessagesMessageKeys.VALIDATE_SERVER_LOGIN_NOT_LENGTH, min = 5, max = 60)
	private String Login;
	@NotNull(message = MessagesMessageKeys.VALIDATE_SERVER_SENHA_NOT_VALID)
	@Size(message = MessagesMessageKeys.VALIDATE_SERVER_SENHA_NOT_LENGTH, min = 5, max = 60)
	private String Senha;
	
	@NotNull(message = MessagesMessageKeys.VALIDATE_SERVER_TYPE_NOT_VALID)
	private ServerType serverType;

}
