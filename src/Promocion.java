/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentina
 */
public class Promocion {
    
    private String descripcion;
    private Producto producto;
    private String fecha;

    public Promocion(String descripcion, Producto producto, String fecha) {
        this.descripcion = descripcion;
        this.producto = producto;
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        String promocion;
        
        promocion="Producto: "+producto.getNombre()+". Descripcion: "+descripcion+". Fecha de vencimiento: "+fecha+".";
        
        return promocion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
