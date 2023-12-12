import { Component } from '@angular/core';
import { Producto } from '../../model/producto';
import { ProductoService } from '../../services/producto.service';

@Component({
  selector: 'app-producto-lista',
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {

  productos:Producto[];

  constructor(private productoServicio:ProductoService){}

  ngOnInit(){
    //Cargamos los productos
    this.obtenerProductos();
  }

  private obtenerProductos(){
    //consumir datos del servicio
    this.productoServicio.obtenerProductosLista().subscribe(
    (datos => {
      this.productos = datos;
    })
    );
  }
}