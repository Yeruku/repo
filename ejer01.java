
package SelectivaMultiple;

import java.util.Scanner;

public class ejer01 {
    //Al ingresar un número, mostrar el día de la semana. (1-7)
    public static void main(String[] args) {
        int num;
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese un número (del 1 al 7): ");
        num=t.nextInt();
        
//        if (num == 7) {
//            System.out.println("DOMINGO");
//        } else if (num == 1) {
//            System.out.println("LUNES");
//        } else if (num == 2) {
//            System.out.println("MARTES");
//        } else if (num == 3) {
//            System.out.println("MIERCOLES");
//        } else if (num == 4) {
//            System.out.println("JUEVES");
//        } else if (num == 5) {
//            System.out.println("VIERNES");
//        } else if (num == 6) {
//            System.out.println("SÁBADO");
//        } else {
//            System.out.println(num + "Error: El número está fuera de rango.");
//        }
        
        switch (num) {
            case 1:
                System.out.println(num + ": DOMINGO");
                break;
            case 2:
                System.out.println(num + ": LUNES");
                break;
            case 3:
                System.out.println(num + ": MARTES");
                break;
            case 4:
                System.out.println(num + ": MIERCOLES");
                break;
            case 5:
                System.out.println(num + ": JUEVES");
                break;
            case 6:
                System.out.println(num + ": VIERNES");
                break;
            default:
                System.out.println(num + ":::::::::::::::::::");
                System.out.println(num + "Error: El número está fuera de rango.");
                
        }
    }        
}