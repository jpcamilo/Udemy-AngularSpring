package gm.inventariosBackEnd.servicio;

import gm.inventariosBackEnd.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public void guardaProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
}
