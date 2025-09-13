
package Ejercicio1Clases;

import java.util.ArrayList;

  public class ProductoData {

    private final ArrayList<Producto> listaProductos = new ArrayList<>();

    public void guardarProducto(Producto p){
        listaProductos.add(p);
    }

        public ArrayList<Producto> getListaProductos() {
            return listaProductos;
        }
    
    public void borrarProducto(Producto p){
        listaProductos.remove(p);
    }
    
    public void modificarProducto(Producto productoNuevo){
        for (Producto it:listaProductos){
            if(it.getIdProducto()==productoNuevo.getIdProducto()){
                it.setCodigo(productoNuevo.getCodigo());
                it.setDescripcion(productoNuevo.getDescripcion());
                it.setCategoria(productoNuevo.getCategoria());
                it.setStock(productoNuevo.getStock());
                it.setPrecio(productoNuevo.getPrecio());
                break;
            }
        }
    }
}
