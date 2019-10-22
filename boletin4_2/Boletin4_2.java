
package boletin4_2;

import java.util.Scanner;


public class Boletin4_2 {


    public static void main(String[] args) {
        
     Satélite sat1= new Satélite();
       sat1.verPosicion();
       Satélite sat2= new Satélite(40,35,15);
       sat2.verPosicion();
       Scanner sc = new Scanner(System.in);
       System.out.println("Valor meridiano = ");
       double meridiano=sc.nextDouble();
       System.out.println("Valor paralelo= ");
       double paralelo= sc.nextDouble();
       System.out.println("Valor distancia terra= ");
       double distanciaTerra= sc.nextDouble();
       Satélite sat3= new Satélite(meridiano ,paralelo ,distanciaTerra);
       sat3.verPosicion();
    }
    
}
