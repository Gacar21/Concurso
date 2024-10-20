
package concurso;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                           1. saludar
                           2. despedirse
                           3.salir
                           """);
        int opc = scanner.nextInt();
        
        if(opc > 3){
            System.out.println("No existe esa opcion");
            
        }else 
            switch(opc){
                case 1:
                    System.out.println("Saludar");
                    break;
                case 2: 
                    System.out.println("Despedirse");
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                        
            }
                  
            
        
    }
}
