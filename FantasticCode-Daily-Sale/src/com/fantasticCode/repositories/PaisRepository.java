package com.fantasticCode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fantasticCode.entities.Paises;

public interface PaisRepository extends JpaRepository<Paises, Integer>{
	
}
