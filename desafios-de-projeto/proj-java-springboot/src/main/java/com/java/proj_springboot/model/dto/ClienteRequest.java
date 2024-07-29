package com.java.proj_springboot.model.dto;

import lombok.Data;

@Data
public class ClienteRequest extends PessoaRequest{
	private String compraProduto;
	private int quantidade;
	private double totalCompra;

}
