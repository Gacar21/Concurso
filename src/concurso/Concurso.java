
package concurso;

import java.util.Scanner;


public class Concurso {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("ingre 3 valores ");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();
        
        if(v1 > v2){
            
        
            if(v1>v3)
                System.out.println("el valor mayor es: " + v1);
            }else
                if(v2>v3){
                    
                
                    System.out.println("el valor mayor es: " +v2);
        }else
                    System.out.println("el valor mayor es: " + v3);
    }
    
}
