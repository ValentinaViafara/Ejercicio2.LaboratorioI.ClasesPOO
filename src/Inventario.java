import java.util.*;
public class Inventario {
    
    private ArrayList<Producto> productos;
    private RegistroHistoricoVentas registroHistoricoVentas;
    private ContactoTienda contactoTienda;
    private ArrayList<Promocion> promociones;

    public Inventario() {
                    
       productos= new ArrayList();
       promociones= new ArrayList();
       registroHistoricoVentas= new RegistroHistoricoVentas();

    }

    
    
    public boolean agregarProductos(Producto producto, int cantidad){
        boolean proceso=false;
        for(int i=0;i<cantidad;i++){
        if(productos.add(producto)){
            proceso=true;
        }        
        }
        return proceso;
    }
    
    public String cambiarPrecioProducto(String nombre, double precio) {
        boolean proceso=false;
        String cambio="";
        if(!productos.isEmpty()){
        for(int i=0; i<productos.size();i++){
            if(productos.get(i)!=null){        
                if(productos.get(i).getNombre().equals(nombre)){
                    productos.get(i).setPrecio(precio);
                    proceso=true;
                }
            }
        }
        if(!proceso){
            cambio+="\n    EL NOMBRE NO COINCIDE CON NINGUN PRODUCTO.";
        }else{
            cambio+="\n    CAMBIO DEL PRODUCTO EXITOSO";
        }
    }else{
            cambio+="\n    NO HAY PRODUCTOS REGISTRADOS.";
        }
   
        
        return cambio;
    }
    

    public String ventaXnombre(String nombre){
        String proceso="";
        boolean proce=false;
       if(!productos.isEmpty()){
           for(int i=0; i<productos.size();i++){
               
             if(productos.get(i).getNombre().equals(nombre)){
             registroHistoricoVentas.getVentas().add(new Venta(productos.get(i)));
             productos.remove(i);
             proceso="\n    PRODUCTO DE SALIDA REGISTRADO";
             proce=true;
             break;    
             }
           }
           if(!proce){
               proceso="\n    NOMBRE NO COINCIDE CON NINGUN PRODUCTO.";
           }
           
       }else{
           proceso="\n    NO HAY NINGUN PRODUCTO REGISTRADO.";
       }
       
       return proceso; 
    }
    
    
    public String ventaXnombreXmayor(String nombreproducto,int cantidad, int telefono, String ubicacion, double costoVenta){
        String proceso="";
        int aux=cantidad;
        int aux1=-1;
        boolean pros=false;
        
        if(!productos.isEmpty()){
            Producto producto= null;
            for(int i=0; i<cantidad; i++){
            for(int j=0; j<productos.size();j++){
                if(productos.get(j).getNombre().equals(nombreproducto)){
                    
                    aux--;
                    aux1=j;
                    producto=productos.get(j);
                    productos.remove(j);
                    pros=true;
                    break;
                }
            }
        }
            if(pros){
            registroHistoricoVentas.getVentasMayor().add(new VentasXmayor(producto, (cantidad-aux),new Cliente(telefono, ubicacion),costoVenta  ));
            }
            
            if(aux==0){
                proceso="\n   PRODUCTOS AL POR MAYOR DE SALIDA REGISTRADOS";
            }else{
                proceso="\n    HACEN FALTA "+aux+" PRODUCTOS EN LA TIENDA, POR LO TANTO SE REGISTRAN "+(cantidad-aux)+" PRODUCTOS DE SALIDA.";
                
            }
            
            
        }else{
            proceso="\n    NO HAY PRODUCTOS REGISTRADOS.";
        }
        return proceso;
        
    }
    
    
    public boolean compraProvedor(CompraProvedor compra, double precioProducto){
        boolean proceso=false;
        
        for(int i=0; i<compra.getCantidad();i++){
            if(productos.add(new Producto(compra.getCompra().getNombre(),precioProducto, compra.getCompra().getPrecio()/compra.getCantidad()))){
                proceso=true;
            }
        }
      
        
        return proceso;
    }
    
    
    
    
    public String agregarPromocion(String descripcion, String nombreProducto, String fecha){
        String proceso="";
        boolean pros=false;
        
     if(!productos.isEmpty()){
      for(int i=0; i<productos.size();i++){
          
          if(productos.get(i).getNombre().equals(nombreProducto)){
          promociones.add(new Promocion(descripcion, productos.get(i), fecha));
          pros=true;
          proceso="\n\n    AGREGACION DE PROMOCION EXITOSA";
          break;
          }
      }
        
      if(!pros){
          proceso="\n    NO SE ENCONTRÓ EL PRODUCTO AL CUAL QUIERE APLICAR PROMOCIÓN";
      }
     }else{
         proceso="\n     NO HAY PRODUCTOS REGISTRADOS";
     }
      return proceso;
    } 
    
    
    
    public String eliminarPromocion(String nombreProducto, String descripcionPromocion){
        String proceso="";
        
       
        if(!promociones.isEmpty()){
        for(int i=0; i<promociones.size();i++){
            if(promociones.get(i).getDescripcion().equals(descripcionPromocion) && promociones.get(i).getProducto().getNombre().equals(nombreProducto)){
             promociones.remove(i);
             proceso="\n    PROMOCIÓN ELIMINADA EXITOSAMENTE";
             break;
            }else{
                proceso="\n    NO HAY PROMOCION QUE COINCIDA CON EL NOMBRE DEL PRODUCTO Y LA DESCRIPCION, DE LA PROMOCIÓN.";
            }
        }
    }else{
            proceso="\n    NO HAY PROMOCIONES REGISTRADAS.";
        }
        return proceso;
    }
    
    
    
    public double obtenerGanancias(){
        double ganancias=0;
        if(!registroHistoricoVentas.getVentas().isEmpty()){
       for(int i=0; i<registroHistoricoVentas.getVentas().size();i++){
           ganancias+=registroHistoricoVentas.getVentas().get(i).obtenerGanancia();
       }
        }
        
        if(!registroHistoricoVentas.getVentasMayor().isEmpty()){
       for(int j=0; j<registroHistoricoVentas.getVentasMayor().size();j++){
         ganancias+=registroHistoricoVentas.getVentasMayor().get(j).obtenerGanancia();
       }
        }
       return ganancias;
    }
    
    
    
    
    
    public String visualizarproductos(){
    String products=""; 
    
        if(!productos.isEmpty()){
            products+="\nPRODUCTOS\n\n"; 
        for(int i=0; i<productos.size();i++){
            if(productos.get(i)!=null){
         products+="   Producto "+(i+1)+": "+productos.get(i).toString()+".\n";
        }
        }
        }else{
            products="\n   NO HAY PRODUCTOS REGISTRADOS";
        }
    return products;
    }
   
    
    
    
    public String visualizarContactoTienda(){
        String contacto="\n";
        
        if(contactoTienda!=null){
            
            contacto+="CONTACTO TIENDA\n";
            contacto+=contactoTienda.toString()+"/n";
        }else{
            contacto+="NO HAY INFORMACIÓN DE LA TIENDA REGISTRADA\n";
        }
        return contacto;
    }
    
 
    public String visualizarPromociones(){
        String proceso="\n";
        
        if(!promociones.isEmpty()){
            proceso+="LISTA PROMOCIONES\n";
            for(int i=0; i<promociones.size();i++){
             if(promociones.get(i)!=null){
                proceso+="  Promocion"+(i+1)+". "+promociones.get(i).toString()+"\n";
            }
            }
        }else{
            
            proceso+="NO HAY PROMOCIONES REGISTRADAS\n";
        }
        
        return proceso;
    }
    
    

   public String descontinuarProducto(String producto){
       String descontinuar="";
       boolean proceso=false;
       
       if(!productos.isEmpty()){
           for(int j=0;j<productos.size();j++){
           for(int i=0;i<productos.size();i++){
               if(productos.get(i)!=null){
               if(productos.get(i).getNombre().equals(producto)){
                  productos.remove(i);
                 proceso=true;
               }
               }
           }
           }
           if(proceso){
               descontinuar+="    PRODUCTO DESCONTINUADO EXITOSAMENTE.";
           }else{
               descontinuar+="    NO HAY PRODUCTOS QUE COINCIDAN CON EL PRODUCTO.";
           }
       }else{
           descontinuar+=   "    NO HAY PRODUCTOS REGISTRADOS.";
       }

    return descontinuar;       
   } 
    
    
   
   
   
   
   
   
   
   
    
    
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public RegistroHistoricoVentas getRegistroHistoricoVentas() {
        return registroHistoricoVentas;
    }

    public ContactoTienda getContactoTienda() {
        return contactoTienda;
    }

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setProsuctos(ArrayList<Producto> prosuctos) {
        this.productos = prosuctos;
    }

    public void setRegistroHistoricoVentas(RegistroHistoricoVentas registroHistoricoVentas) {
        this.registroHistoricoVentas = registroHistoricoVentas;
    }

    public void setContactoTienda(ContactoTienda contactoTienda) {
        this.contactoTienda = contactoTienda;
    }

    public void setPromociones(ArrayList<Promocion> promociones) {
        this.promociones = promociones;
    }
    
    
    
}
