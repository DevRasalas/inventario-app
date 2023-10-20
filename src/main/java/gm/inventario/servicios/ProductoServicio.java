package gm.inventario.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.inventario.modelo.Producto;
import gm.inventario.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProductos() {
        return this.productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        return this.productoRepositorio.findById(idProducto).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return this.productoRepositorio.save(producto);
        
    }

    @Override
    public void borrarProductoPorId(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);
    }
    
}
