
package boletin4_1;

import java.util.Scanner;


public class Boletin4_1 {

    public static void main(String[] args) {
        
        Coche vw;
        int valor;
        Scanner sc;
        sc=new Scanner(System.in);
        vw=new Coche();
        System.out.println("Introduzca valor:");
        valor=sc.nextInt();
        vw.acelerar(valor);
        System.out.println("Velocidad Actual: " + vw.getVelocidad());
        System.out.println("Introduzca valor:");
        valor=sc.nextInt();
        vw.frenar(valor);
        System.out.println("Velocidad Actual: " + vw.getVelocidad());
        
    }
  
}
