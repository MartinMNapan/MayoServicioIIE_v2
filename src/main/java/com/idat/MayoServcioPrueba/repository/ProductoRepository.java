package com.idat.MayoServcioPrueba.repository;

import java.util.List;

import com.idat.MayoServcioPrueba.model.Productos;

public interface ProductoRepository {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);

}
