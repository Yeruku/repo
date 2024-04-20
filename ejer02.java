
package SelectivaMultiple;

import java.util.Scanner;

public class ejer02 {
    /* Crear una aplicación que solicite el nombre del alumno,
    la especialidad, las 4 calificaciones (PC1, PC2, PC3 y EXF),
    calcular el proemdio, evaluar la condición (APROBADO O DESAPROBADO),
    el nivel: Excelente=17-20, Bueno=14-16, Regular=11-13, Malo=5-10, Pésimo = menor que 5.
    Generar la boleta de notas */
    
    public static void main(String[] args) {
        // Declarar variables, String para texto.
        String nom, curso, cond , nivel="";
        double pc1, pc2, pc3, exf, prom;
        
        // Pedir datos, t.next() para texto.
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese nombre del alumno : ");
        nom=t.next();
        System.out.println("Ingrese nombre del curso  : ");
        curso=t.next();
        
        //Pedir datos, t.nextDouble() para datos numéricos.
        System.out.println("Ingrese nota PC1 : ");
        pc1=t.nextDouble();
        System.out.println("Ingrese nota PC2 : ");
        pc2=t.nextDouble();
        System.out.println("Ingrese nota PC3 : ");
        pc3=t.nextDouble();
        System.out.println("Ingrese nota EXF : ");
        exf=t.nextDouble();
        
        //Cálculo de promedio
        prom = (pc1+pc2+pc3+exf)/4;
        
        if (prom >= 12) {
            cond = "APROBADO";
        } else {
            cond = "DESAPROBADO";
        }
        
        if (prom < 5) {
            nivel = "PÉSIMO";
        } else if (prom < 10 && prom >= 5) {
            nivel = "MALO";
        } else if (prom < 13 && prom >= 11) {
            nivel = "REGULAR";
        } else if (prom < 16 && prom >= 14) {
            nivel = "BUENO";
        } else if (prom < 20 && prom >= 17) {
            nivel = "EXCELENTE";
        }
        System.out.println("");
        System.out.println(":::::::::::::::BOLETA DE NOTAS:::::::::::::::");
        System.out.println("Nombres  : " + nom);
        System.out.println("Curso    : " + curso);
        System.out.println("Promedio : " + prom);
        System.out.println("Condicion: " + cond);
        System.out.println("Nivel    : " + nivel);
    }
}
