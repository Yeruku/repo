package SelectivaMultiple;

import java.util.Date;
import java.util.Scanner;

public class ejer03 {
    /* 
    - Implementar un programa que genere una boleta de venta
    similar a la mostrada (salida con formato).
    - Debe solicitar mediante Scanner, los siguientes datos:
    nombre de cliente, nombre de producto, precio y cantidad comprada.
    - Si el cliente se llama ANA o JUAN, realizar un descuento del 5%
    (String.equals)
    - Si el nombre del producto contiene la palabra GAMER, realizar
    adicionalmente un descuento de 2% (Strings.contains)
    - Deben ingresarse los datos de dos productos distintos.
    
    */
    public static void main(String[] args) {
        
        // Declarar variables:
        String nomCliente;
        String nomProducto1, nomProducto2;
        //***double para decimales, int para enteros.
        double precioPro1, precioPro2;
        int cantPro1, cantPro2;
        double desc = 0;
        double totalNoDesc, totalSiDesc;
        
        //Inicializar Scanner
        Scanner t = new Scanner(System.in);
        //Obtener fecha y hora actual (solo para la info de la boleta)
        Date fechaHoraActual = new Date();
        
        // Solicitar datos al usuario.
        System.out.println("Ingrese el nombre del cliente: ");
        nomCliente = t.nextLine();
        
        System.out.println("Ingrese el nombre del Producto 1: ");
        nomProducto1 = t.next();
        System.out.println("Ingrese el precio del Producto 1: ");
        precioPro1 = t.nextDouble();
        System.out.println("Ingrese el cantidad del Producto 1: ");
        cantPro1 = t.nextInt();
        
        System.out.println("Ingrese el nombre del Producto 2: ");
        nomProducto2 = t.next();
        System.out.println("Ingrese el precio del Producto 2: ");
        precioPro2 = t.nextDouble();
        System.out.println("Ingrese el cantidad del Producto 2: ");
        cantPro2 = t.nextInt();
        
        // Calcular descuento
        if (nomCliente.equalsIgnoreCase("ANA") || nomCliente.equalsIgnoreCase("JUAN")) {
            desc += 0.05;
        }
        if (nomProducto1.toLowerCase().contains("gamer")) {
            desc += 0.02;
        }
        if (nomProducto2.toLowerCase().contains("gamer")) {
            desc += 0.02;
        }
        
        // Calcular total sin descuento
        totalNoDesc = (precioPro1 * cantPro1) + (precioPro1 * cantPro2);

        // Aplicar descuento
        totalSiDesc = totalNoDesc - (totalNoDesc * desc);

        // Imprimir boleta de venta
        System.out.println("#############################");
        System.out.println("          TIENDA ABC         ");
        System.out.println("#############################");
        System.out.println("ID: 0000252145               ");
        System.out.println("                             ");
        System.out.println("           COMPRAS           ");
        System.out.println("      AV. SAENZ PENA 376     ");
        System.out.println("           CHICLAYO          ");
        System.out.println("      LOTE: B  TERM:5238     ");
        System.out.println("#############################");
        System.out.printf("FECHA: %tD HORA: %tT%n", fechaHoraActual, fechaHoraActual);
        System.out.println("VEND:JUAN     CLI:" + nomCliente);
        System.out.println("#############################");
        System.out.println(cantPro1+ " " + nomProducto1 + " | S/." + precioPro1);
        System.out.println(cantPro2+ " " + nomProducto2 + " | S/." + precioPro2);
        if (totalSiDesc > 0) {
            System.out.println("PAGO TOTAL: S/." + totalSiDesc);
        } else {
            System.out.println("PAGO TOTAL: S/." + totalNoDesc);
        }
        System.out.println(" ");
        System.out.println("#############################");
        System.out.println("          NO VUELVA!         ");
        System.out.println("#############################");
    }  
}

