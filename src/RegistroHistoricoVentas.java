import java.util.*;
public class RegistroHistoricoVentas {
 
    private ArrayList<Venta> ventas;
    private ArrayList<VentasXmayor> ventasMayor;

    public RegistroHistoricoVentas() {
        ventas= new ArrayList();
        ventasMayor= new ArrayList();
    }

    
    
    @Override
    public String toString(){
        String registro="";
       if(!ventas.isEmpty()){
           registro+="    *\n  VENTAS NORMALES:\n\n";
           for(int i=0; i<ventas.size();i++){
               
               registro+="       Ventas "+(i+1)+". Nombre producto vendido: "+ventas.get(i).getProductoSalida().getNombre()+". Precio de venta: "+ventas.get(i).getProductoSalida().getPrecio()+". Ganancia: "+". \n";
           }
           
       }else{
           registro+="    NO HAY VENTAS REGISTRADAS\n";
       }
        registro+="\n\n";
       
       if(!ventasMayor.isEmpty()){
           registro+="\n    *VENTAS POR MAYOR:\n\n";
           for(int j=0;j<ventasMayor.size();j++){
               
               registro+="     Ventas por mayor "+(j+1)+". Nombre producto vendido: "+ventasMayor.get(j).getProducto().getNombre()+". Costo de venta: "+ventasMayor.get(j).getCostoVenta()+". Cantidad de producto: "+ventasMayor.get(j).getCantidadProducto()+".\n";
           }
           
       }else{
       registro+="    NO HAY VENTAS AL POR MAYOR REGISTRADAS\n";    
       }
        return registro;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public ArrayList<VentasXmayor> getVentasMayor() {
        return ventasMayor;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public void setVentasMayor(ArrayList<VentasXmayor> ventasMayor) {
        this.ventasMayor = ventasMayor;
    }
}
