
package Clases;

import java.util.Objects;

public class Categorias {
   
    private String NombreCategoria;

    public Categorias() {
    }

    public Categorias(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
    public String getNombrecategoria() {
        return NombreCategoria;
    }

    @Override
    public String toString() {
        return NombreCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.NombreCategoria);
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
        final Categorias other = (Categorias) obj;
        return Objects.equals(this.NombreCategoria, other.NombreCategoria);
    }

}
