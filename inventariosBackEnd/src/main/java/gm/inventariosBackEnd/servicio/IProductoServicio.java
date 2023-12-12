package gm.inventariosBackEnd.servicio;

import gm.inventariosBackEnd.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardaProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
}
