
package Ejercicio1Clases;

import java.util.ArrayList;

public class CategoriaData {
    
    public ArrayList<Categoria> obtenerCategorias(){
        ArrayList<Categoria> lista=new ArrayList<>();
        lista.add(new Categoria(1,"Fiambres"));
        lista.add(new Categoria(2,"Lacteos"));
        lista.add(new Categoria(3,"Almacen"));
        lista.add(new Categoria(4,"Perfumeria"));
        return lista;
    }
}
