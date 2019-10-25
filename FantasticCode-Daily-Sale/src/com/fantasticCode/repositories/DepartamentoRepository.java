package com.fantasticCode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fantasticCode.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
	
}
