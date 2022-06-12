package com.idat.MayoServcioPrueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServcioPrueba.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
	
	

}
