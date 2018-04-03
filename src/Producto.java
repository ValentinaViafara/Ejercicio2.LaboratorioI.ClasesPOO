import java.util.*;
public class Producto {
    
    
    private String nombre;
    private int precio;
    private int costoProducto;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, int costoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoProducto = costoProducto;
    }

    
    @Override
    public String toString(){
       
      return "Nombre: "+nombre+". Precio de venta en tienda: "+precio+"."; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
