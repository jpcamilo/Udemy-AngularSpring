package gm.inventariosBackEnd.controlador;

import gm.inventariosBackEnd.modelo.Producto;
import gm.inventariosBackEnd.servicio.IProductoServicio;
import gm.inventariosBackEnd.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private IProductoServicio productoServicio;

    //http://localhost:8080/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.listarProductos();
        logger.info("Productos obtenidos:");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        logger.info("Producto a agregar" + producto);
        return  this.productoServicio.guardaProducto(producto);
    }

}
