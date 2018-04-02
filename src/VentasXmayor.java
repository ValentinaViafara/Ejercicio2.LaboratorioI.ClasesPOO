
public class VentasXmayor {
    
    private Producto producto;
    private int cantidadProducto;
    private Cliente cliente;
    private double costoVenta;

    public VentasXmayor(Producto producto, int cantidadProducto, Cliente cliente, double costoVenta) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.cliente = cliente;
        this.costoVenta = costoVenta;
    }

   
   public double obtenerGanancia(){
       double costoInvertidoTotalProductos=cantidadProducto*producto.getPrecio();
       return  costoVenta-costoInvertidoTotalProductos;
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Producto getProducto() {
        return producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }
    
    
    
}
