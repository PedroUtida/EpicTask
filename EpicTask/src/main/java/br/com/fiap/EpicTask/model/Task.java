package br.com.fiap.EpicTask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Task {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	(message = "Nome é um campo obrigatório")
	private String username;
	
	@Email
	@NotEmpty
	(message = "Insira um endereço de e-mail válido")
	private String email;
	
	@Size
	(min = 8, message = "Senha deve conter pelo menos 8 caracteres")
	private String password;
}