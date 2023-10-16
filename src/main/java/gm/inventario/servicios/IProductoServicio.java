package gm.inventario.servicios;

import java.util.List;

import gm.inventario.modelo.Producto;

public interface IProductoServicio {
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId(Integer idProducto);
    public void guardarProducto(Producto producto);
    public void borrarProductoPorId(Integer idProducto);
}
