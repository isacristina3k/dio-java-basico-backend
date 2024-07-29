package com.java.proj_springboot.model.dto;

import lombok.Data;

@Data
public class PessoaRequest {
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;
	private int idade;

}
