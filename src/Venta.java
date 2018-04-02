
public class Venta {
    
    private Producto productoSalida;
    

    public Venta(Producto productoSalida) {
        this.productoSalida = productoSalida;
   
    }

    public double obtenerGanancia(){
        return productoSalida.getCostoProducto()-productoSalida.getPrecio();
    }
    
    
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    public Producto getProductoSalida() {
        return productoSalida;
    }



    public void setProductoSalida(Producto productoSalida) {
        this.productoSalida = productoSalida;
    }

  
}
