/*
 * 
Ejercicio 4: Un obrero necesita calcular su salario semanal, el cual se obtiene
de la siguiente manera: - Si trabaja 40 horas o menos se le paga a $16.000 
la hora - Si trabaja más de 40 horas se le paga a $16.000 por cada una de las
primeras 40 horas y $20.000 por cada hora extra.

 */
package salario.obrero;

import javax.swing.JOptionPane;

public class SalarioObrero {

  
    public static void main(String[] args) {
        
        int horasTrabajas;
        float salarioTotal;
        
        horasTrabajas = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el total de horas trabajadas"));
        
        if(horasTrabajas <= 40){
            salarioTotal = horasTrabajas * 16;
        }
        else{
            salarioTotal = (40*16) + ((horasTrabajas - 40)*20);
        }
        JOptionPane.showMessageDialog(null," El salario total es: "
                + salarioTotal);
    }
    
}
