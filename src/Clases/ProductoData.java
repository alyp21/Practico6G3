
package Clases;

import java.util.ArrayList;

public class ProductoData {
    public class ProductosData {

    private final ArrayList<Producto> listaProductos = new ArrayList<>();

    public void guardarProducto(Producto p){
        p.setIdProducto(listaProductos.size()+1);
        listaProductos.add(p);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return listaProductos;
    }
    
    public void borraProducto(Producto p){
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
}
