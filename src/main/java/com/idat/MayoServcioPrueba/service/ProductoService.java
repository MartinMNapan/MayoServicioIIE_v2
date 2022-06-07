package com.idat.MayoServcioPrueba.service;

import java.util.List;

import com.idat.MayoServcioPrueba.model.Productos;

public interface ProductoService {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);

}
