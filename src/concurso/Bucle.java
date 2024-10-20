
package concurso;

import java.util.Scanner;


public class Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int count = 0;
        
        while (sc.hasNext()) {
            String next = sc.next();
            if(next.equals("salir")){
                System.out.println("Clave correcta");
                  System.out.println("numero de intentos: " + count);
            }else{
                System.out.println("clave incorrecta");
                count++;
            }
        }
      
    }
}
