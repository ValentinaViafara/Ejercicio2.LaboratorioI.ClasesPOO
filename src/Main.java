import java.util.Scanner;
public class Main {

public static void main(String []arg){
     Scanner entrada=new Scanner(System.in);
    
    System.out.println("                                  BIENVENIDO\n\n\n\n");

    Inventario Panaderia= new Inventario(); 
    
    
    String opcion;
    int aux=1;
    
    while(aux==1){
//MENU PRINCIPAL
    System.out.println("PRESIONE LA OPCION QUE QUIERE\n");
    System.out.println("1. Agregar productos al inventario.");
    System.out.println("2. Descontinuar producto del inventario.");
    System.out.println("3. Listar productos.");
    System.out.println("4. Cambiar precio de producto.");
    System.out.println("5. Agregar promoción.");
    System.out.println("6. Eliminar promocion.");
    System.out.println("7. Listar promociones.");
    System.out.println("8. Registrar venta.");
    System.out.println("9. Registrar venta por mayor.");
    System.out.println("10. Listar el registro histórico de ventas.");
    System.out.println("11. Registrar compra a provedor. ");
    System.out.println("12. Mostrar ganancias.");
    System.out.println("13. Registrar contacto tienda");
    System.out.println("14. Cambiar datos del contacto de la tienda.");
    System.out.println("15. Mostrar datos de contacto");
    System.out.println("16. Salir\n");
    
    opcion=entrada.next();
    
    
    //OPCIONES
    switch(opcion){
        
        case "1":
            
            System.out.println("\n\n\n");
            System.out.println("1. Agregar productos al inventario.");
            
            String nombreProductoAgregar;
            int precioProductoAgregar;
            int cantidadProductoAgregar;
            System.out.print("  -Escriba el nombre del producto= ");
            nombreProductoAgregar=entrada.next();
            System.out.print("  -Escriba el precio de venta del producto en su tienda= ");
            precioProductoAgregar=entrada.nextInt();
            System.out.print("  -Escriba la cantidad del producto que quiere agregar= ");
            cantidadProductoAgregar=entrada.nextInt();
            int precioProductoCosto;
            System.out.print("  -Escriba el costo que pago por la unidad del producto= ");
            precioProductoCosto=entrada.nextInt();
            
            
            if(Panaderia.agregarProductos(new Producto(nombreProductoAgregar, precioProductoAgregar, precioProductoCosto), cantidadProductoAgregar)){
                System.out.println("\n    PRODUCTO AGREGADO AL INVENTARIO\n\n\n\n");  
            }
            
            
            break;
            
            
        case "2":
            
            System.out.println("\n\n\n2. Descontinuar producto del inventario.");
            
            System.out.print("  -Escriba el nombre del producto que quiere descomtinuar= ");
            String nombreProductoEliminar;
            nombreProductoEliminar=entrada.next();
            System.out.println("\n");
            
            System.out.println(Panaderia.descontinuarProducto(nombreProductoEliminar)+"\n\n\n\n");
            
            
            break;
            
        case "3":
            
            System.out.println("\n\n\n");
            System.out.println("3. Listar productos.");
            System.out.println(Panaderia.visualizarproductos()+"\n\n\n\n");
            
            break;
            
        case "4":
            
            System.out.println("\n\n\n4. Cambiar precio de producto.");
            
            String nombreProductoCambioPrecio;
            System.out.print("  -Digite el nombre del producto del cual quiere modificar el precio= ");
            nombreProductoCambioPrecio=entrada.next();
            
            int precioProductoCambio;
            System.out.print("  -Digite el nuevo precio del producto= ");
            precioProductoCambio=entrada.nextInt();
            
            System.out.println(Panaderia.cambiarPrecioProducto(nombreProductoCambioPrecio, precioProductoCambio)+"\n\n\n\n");
            
            
            break;
            
            
        case "5":
            System.out.println("\n\n\n5. Agregar promoción.");
            
            String nombreProductoPromocion;
            System.out.print("  -Digite nombre del producto de la promocion= ");
            nombreProductoPromocion=entrada.next();
            
            String descripcionPromocion;
            System.out.print("  -Digite descripción de la promoción= ");
            descripcionPromocion=entrada.next();
            
            String fechaPromocion;
            System.out.print("  -Digite fecha de vencimiento de promoción= ");
            fechaPromocion=entrada.next();
            
            System.out.println(Panaderia.agregarPromocion(descripcionPromocion, nombreProductoPromocion, fechaPromocion)+"\n\n\n\n");
            
            break;
            
        case "6":
            System.out.println("\n\n\n6. Eliminar promocion.");
       
            String nombreProductoPromocionParaEliminar;
            System.out.print("  -Escriba nombre del producto de la promoción que desea eliminar= ");
            nombreProductoPromocionParaEliminar=entrada.next();
            
            String descripcionPromocionParaEliminar;
            System.out.print("  -Escriba descripción de la promoción que desea eliminar= ");
            descripcionPromocionParaEliminar=entrada.next();
            
            System.out.println(Panaderia.eliminarPromocion(nombreProductoPromocionParaEliminar, descripcionPromocionParaEliminar)+"\n\n\n\n");
           
            break;
            
            
        case "7":
            System.out.println("\n\n\n7. Listar promociones.");
            
            System.out.println(Panaderia.visualizarPromociones()+"\n\n\n\n");
            
            break;
            
        case "8":
            System.out.println("\n\n\n8. Registrar venta.");
            
            String nombreProductoDeVenta;
            System.out.print("  -Digite el nombre del producto de la venta= ");
            nombreProductoDeVenta=entrada.next();
            
            System.out.println(Panaderia.ventaXnombre(nombreProductoDeVenta)+"\n\n\n\n");
     
            
            break;
            
            
        case "9":
            System.out.println("\n\n\n9. Registrar venta por mayor.");
            
            System.out.println("\n  DATOS CLIENTE QUE REALIZA COMPRA: ");
            
            int telefonoCliente;
            System.out.print("   -Digite numero del cliente= ");
            telefonoCliente=entrada.nextInt();
            
            String ubicacionCliente;
            System.out.print("   -Digite ubicación del cliente= ");
            ubicacionCliente=entrada.next();
            
            System.out.println("\n  DATOS DE LA VENTA AL POR MAYOR:");
            String nombreProductoVentaXmayor;
            System.out.print("   -Digite nombre del producto= ");
            nombreProductoVentaXmayor=entrada.next();
            
            int cantidadVentaDelProducto;
            System.out.print("   -Digite cantidad del producto de la venta= ");
            cantidadVentaDelProducto= entrada.nextInt();
            
            int costoVentaPorMayor;
            System.out.print("   -Digite costo de la venta= ");
            costoVentaPorMayor=entrada.nextInt();
            
            System.out.println("\n\n"+Panaderia.ventaXnombreXmayor(nombreProductoVentaXmayor, cantidadVentaDelProducto, telefonoCliente, ubicacionCliente, costoVentaPorMayor)+"\n\n\n\n");
            
            
            break;
            
        case "10":
            System.out.println("\n\n\n10. Listar el registro histórico de ventas.");
            
            System.out.println("\n"+Panaderia.getRegistroHistoricoVentas().toString()+"\n\n\n\n");
            
            break;
            
        case "11":
            System.out.println("\n\n\n11. Registrar compra a provedor.");
            
            String nombreProductoCompra;
            System.out.print("  -Digite nombre del producto de la compra= ");
            nombreProductoCompra=entrada.next();
            
            int precioProductoCompraUnidad;
            System.out.print("  -Digite el costo que tiene la compra de cada unidad del producto= ");
            precioProductoCompraUnidad=entrada.nextInt();
            
            int cantidadProductoCOmpra;
            System.out.print("  -Digite la cantidad de producto de la compra= ");
            cantidadProductoCOmpra=entrada.nextInt();
            
            
            int precioEStablecidoProducto;
            System.out.print("  -Digite el precio al cual estará el producto en la tienda= ");
            precioEStablecidoProducto=entrada.nextInt();
            
            if(Panaderia.compraProvedor(new CompraProvedor(new Producto(nombreProductoCompra, precioProductoCompraUnidad), cantidadProductoCOmpra), precioEStablecidoProducto)){
                System.out.println("\n       REGISTRO DE PRODUCTOS EXITOSO.");
            }
            
            
            
            break;
            
        case "12":
            System.out.println("\n\n\n12. Mostrar ganancias.");
            System.out.println("\n ganancias= "+Panaderia.obtenerGanancias()+"\n\n\n\n");
            
            break;
            
            
        case "13":
            System.out.println("\n\n\n13. Registrar contacto tienda");
            
            String horarioContactoTienda;
            System.out.print("  -Digite horario de la tienda (sin espacios)= ");
            horarioContactoTienda=entrada.next();
            
            int telefonoContactoTienda;
            System.out.print("  -Digite numero de la tienda= ");
            telefonoContactoTienda= entrada.nextInt();
            
            Panaderia.setContactoTienda(new ContactoTienda(horarioContactoTienda,telefonoContactoTienda));
            System.out.println("  \n\n    AGREGACIÓN DE CONTACTOS FUE EXITOSO.\n\n\n\n");
            
            
            
            break;
            
        case "14":
            System.out.println("\n\n\n14. Cambiar datos del contacto de la tienda.");
            
            if(Panaderia.getContactoTienda()!=null){
            
            System.out.println("\n\n     14.1. Cambiar horario. Presione 1.");
            System.out.println("     14.2. Cambiar telefono. Presione 2.");
            System.out.print("\n  PRESIONE LA OPCION QUE DESEA= ");
            
            String seleccion;
            seleccion=entrada.next();
            
            switch(seleccion){
                case "1":
                    
                    String horarioNuevoTienda;
                    System.out.print("  -Digite nuevo horario= ");         
                    horarioNuevoTienda=entrada.next();
                    
                    Panaderia.getContactoTienda().setHorario(horarioNuevoTienda);
                    System.out.println("\n\n        HORARIO MODIFICADO EXITOSAMENTE.\n\n\n\n");
                 
                    break;
                 
                    
                    
                case "2":
                    
                    String numeroNuevoTienda;
                    System.out.print("  -Digite nuevo telefono= ");
                    numeroNuevoTienda=entrada.next();
                    
                    Panaderia.getContactoTienda().setHorario(numeroNuevoTienda);
                    System.out.println("\n\n       TELEFONO MODIFICADO EXITOSAMENTE. \n\n\n\n");
                    
                    
                    break;
                    
                default:
                    
                    System.out.println("\n       LA TECLA INDICADA NO CORRESPONDE CON NINGUNA OPCION.\n\n\n\n");
            }
            }else{
                System.out.println("\n       NO HAY NINGUNA INFORMACIÓN DEL CONTACTO DE LA TIENDA REGISTRADO.\n\n\n\n");
               
            }
            
            
            break;
            
            
        case "15":
            System.out.println("\n\n\n15. Mostrar datos de contacto");
            System.out.println(Panaderia.visualizarContactoTienda()+"\n\n\n\n");
            
            break;
            
        case "16":
            System.out.println("\n\n\n16. Salir");
            
            aux=0;
            
            break;
            
        
        default:
            
            System.out.println("\n\n  LA TECLA PRESIONADA NO CORRESPONDE A NINGUNA DE LAS OPCIONES\n\n\n");
    }
    
    }
    
    
}    
}
