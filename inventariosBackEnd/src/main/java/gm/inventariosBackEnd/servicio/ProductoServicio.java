package gm.inventariosBackEnd.servicio;

import gm.inventariosBackEnd.modelo.Producto;
import gm.inventariosBackEnd.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;

    /**
     * @return
     */
    @Override
    public List<Producto> listarProductos() {
        return this.productoRepositorio.findAll();
    }

    /**
     * @param idProducto
     * @return
     */
    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto = this.productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    /**
     * @param producto
     */
    @Override
    public Producto guardaProducto(Producto producto) {
        return this.productoRepositorio.save(producto);
    }

    /**
     * @param idProducto
     */
    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);
    }
}
