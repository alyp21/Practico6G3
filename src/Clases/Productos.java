
package Clases;

import java.util.Objects;

public class Productos {
    
    private int idProducto;
    private String NombreProducto;
    private double precio;

    public Productos() {
    }

    public Productos(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public Productos(String NombreProducto, double precio) {
        this.NombreProducto = NombreProducto;
        this.precio = precio;
    }

    public Productos(int idProducto, String NombreProducto, double precio) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
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
        return "Producto:" + " " + NombreProducto + "  Precio: " + precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.NombreProducto);
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
        final Productos other = (Productos) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.NombreProducto, other.NombreProducto);
    }
    
    
}
