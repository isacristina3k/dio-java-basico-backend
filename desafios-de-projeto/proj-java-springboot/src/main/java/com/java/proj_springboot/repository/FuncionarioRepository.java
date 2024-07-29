package com.java.proj_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.proj_springboot.model.entity.FuncionarioEntity;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Integer> {
	boolean existsByCpf(String cpf);
}
