import { Component } from '@angular/core';
import { Producto } from '../../model/producto';
import { ProductoService } from '../../services/producto.service';
import { AppRoutingModule } from '../../app-routing.module';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {

  productos:Producto[];

  constructor(private productoServicio:ProductoService, private enrutador:Router){}

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

  editarProducto(id: number){
    this.enrutador.navigate(['editar-producto', id]);
  }
}