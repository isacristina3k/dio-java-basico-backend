package com.java.proj_springboot.model.entity;

import lombok.Data;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tab_funcionario")
@Data
public class FuncionarioEntity extends PessoaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	

}
