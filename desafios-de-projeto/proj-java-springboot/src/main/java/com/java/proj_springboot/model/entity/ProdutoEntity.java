package com.java.proj_springboot.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "tab_produto")
@Data
public class ProdutoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	private String nomeProduto;
	private String marcaProduto;
	private int quantidade;
}
