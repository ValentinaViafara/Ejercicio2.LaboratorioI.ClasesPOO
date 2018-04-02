import java.util.*;
public class Producto {
    
    
    private String nombre;
    private double precio;
    private double costoProducto;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, double costoProducto) {
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

    public double getPrecio() {
        return precio;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
