
package Ejercicio2Clases;

<<<<<<< HEAD

public class ProductoSA {
    // holi
    //commit
=======
import java.util.Objects;


public class ProductoSA {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    public ProductoSA(int codigo, String descripcion, double precio, int stock, String rubro) {
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

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.descripcion);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 29 * hash + this.stock;
        hash = 29 * hash + Objects.hashCode(this.rubro);
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
        final ProductoSA other = (ProductoSA) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.rubro, other.rubro);
    }

    @Override
    public String toString() {
        return "Producto = " + "codigo: " + codigo + ", descripcion: " + descripcion + ", precio: " + precio + ", stock: " + stock + ", rubro: " + rubro;
    }
>>>>>>> 8b3edb8884ee61666dec3d2e6d52ab0584228bf2
}
