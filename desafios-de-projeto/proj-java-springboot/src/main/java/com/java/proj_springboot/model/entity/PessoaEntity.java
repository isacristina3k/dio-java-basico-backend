package com.java.proj_springboot.model.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table (name = "tab_pessoa")
@Data

public class PessoaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;
	private int idade;

}
