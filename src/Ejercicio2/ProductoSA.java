
package Ejercicio2;

import Ejercicio1.Producto;
import static Ejercicio2.Menu.listaProductos;
import java.util.Objects;
import java.util.TreeSet;


public class ProductoSA implements Comparable <ProductoSA>{
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Rubro rubro;

    public ProductoSA() {
    }

    public ProductoSA(int codigo, String descripcion, double precio, int stock, Rubro rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(ProductoSA o) {
        if (codigo==o.codigo){
            return 0;
        }else if (codigo > o.codigo){
            return 1;
        }else { 
            return -1;
        }
    }
    void guardarProductos(ProductoSA p) {
        listaProductos.add(p);
    }
    
    public TreeSet<ProductoSA> getListaProductos() {
            return listaProductos;
    }
        public void modificarProducto(ProductoSA productoNuevo){
        for (ProductoSA it:listaProductos){
            if(it.getCodigo()==productoNuevo.getCodigo()){
                it.setDescripcion(productoNuevo.getDescripcion());
                it.setRubro((Rubro)productoNuevo.getRubro());
                it.setStock(productoNuevo.getStock());
                it.setPrecio(productoNuevo.getPrecio());
                break;
            }
        }
    }
        public void borrarProducto(Producto p){
            listaProductos.remove(p);
    }
}
