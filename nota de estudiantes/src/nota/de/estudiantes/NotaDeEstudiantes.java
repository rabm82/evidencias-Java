/*
Ejercicio 4: La calificación final de un estudiante de sistemas se calcula con base en las
calificaciones de 4 aspectos de su rendimiento académico; participación, primer examen
parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25% y 40%, Hacer un
programa que calcule e imprima la calificación final obtenida por un estudiante.

 */
package nota.de.estudiantes;

import java.util.Scanner;

public class NotaDeEstudiantes {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        float part,ex1,ex2,ex3,notafinal;
        System.out.println("ingrese nota de participación: ");
        part = entrada.nextFloat();
        System.out.println("ingrese nota de 1 examen parcial: ");
        ex1 = entrada.nextFloat();
        System.out.println("ingrese nota de 2 examen parcial: ");
        ex2 = entrada.nextFloat();
        System.out.println("ingrese nota de 3 examen final: ");
        ex3 = entrada.nextFloat();
        
        part *= 0.10f;
        ex1 *=  0.25f;
        ex2 *=  0.25f;
        ex3 *=  0.40f;
        
        notafinal = part + ex1 + ex2 + ex3;
        System.out.println("calicacion final es: " + notafinal );
        
        
        
        
    }
    
}
