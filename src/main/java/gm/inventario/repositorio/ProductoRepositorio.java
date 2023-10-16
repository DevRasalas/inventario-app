package gm.inventario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.inventario.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    
}
