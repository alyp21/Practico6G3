
package Clases;

import java.util.Objects;

public class Producto {
    private int idProducto;
    private int codigo;
    private String descripcion;
    private double precio;
    private Categoria categoria;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, Categoria categoria, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public Producto(int idProducto, int codigo, String descripcion, double precio, Categoria categoria, int stock) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + ", stock=" + stock + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.idProducto);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.idProducto) != Double.doubleToLongBits(other.idProducto)) {
            return false;
        }
        return true;
    }
}