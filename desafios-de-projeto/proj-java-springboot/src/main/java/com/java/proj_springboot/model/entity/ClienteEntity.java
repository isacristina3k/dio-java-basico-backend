package com.java.proj_springboot.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tab_pessoa")
@Data
public class ClienteEntity extends PessoaEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	private String compraProduto;
	private int quantidade;
	private double totalCompra;

}
