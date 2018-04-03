
public class Venta {
    
    private Producto productoSalida;
    

    public Venta(Producto productoSalida) {
        this.productoSalida = productoSalida;
   
    }

    public double obtenerGanancia(){
        return productoSalida.getPrecio()-productoSalida.getCostoProducto();
    }
    
    
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    public Producto getProductoSalida() {
        return productoSalida;
    }



    public void setProductoSalida(Producto productoSalida) {
        this.productoSalida = productoSalida;
    }

  
}
