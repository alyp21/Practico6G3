
package Clases;

import java.util.ArrayList;

public class ProductosData {
    
    private ArrayList<Productos> listaProductos = new ArrayList<>();
    
    public void guardarProducto(Productos p){
        p.setNombreProducto(String.valueOf(listaProductos.size()));
        listaProductos.add(p);
    }
    public ArrayList<Productos> obtenerProductos(){
        return listaProductos;
    }
}
