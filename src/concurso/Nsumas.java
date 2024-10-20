
package concurso;

import java.util.Scanner;


public class Nsumas {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Ingrese el valor N ");
         int N = scanner.nextInt();
         int contador=0;
         
         for (int i = 0; i <= N ; i++) {
             contador= contador + i;
             System.out.println(contador);
             
        }
    }

    
          
    
}
