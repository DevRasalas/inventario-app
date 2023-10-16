package gm.inventario.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gm.inventario.modelo.Producto;
import gm.inventario.servicios.ProductoServicio;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin("http://localhost:4200")
public class controladorProducto {
    
    @Autowired
    private ProductoServicio productoServicio;
    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        return productoServicio.listarProductos();
    }
}
