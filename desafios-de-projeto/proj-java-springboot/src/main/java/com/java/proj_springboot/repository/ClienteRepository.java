package com.java.proj_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.proj_springboot.model.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    boolean existsByCpf(String cpf);
}
