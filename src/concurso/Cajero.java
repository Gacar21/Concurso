
package concurso;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int saldo = 1000;
         int deposito = 0;
        System.out.println("""
                           1. mirar saldo
                           2. depositar saldo
                           3. retirar saldo
                           4. salir
                           
                           """);
        
        int opc = scanner.nextInt();
        while(opc <=4){
            
           switch(opc){
               
                 case 1: 
                     System.out.println("tu saldo es: " + saldo);
                     System.out.println("4. salir");
                     opc = scanner.nextInt();
                   break;
                 case 2:
                     System.out.println("ingrese el saldo a depositar");
                     int deposit = scanner.nextInt();
                     
                     if(deposit <0){
                         System.out.println("no puedes depositar negativos");
                         break;
                     }else 
                      System.out.println("4. salir");
                         opc = scanner.nextInt();
                    saldo = saldo + deposit;
                     break;
                     
                 case 3:
                        System.out.println("digite la cantidad de dinero a retirar");
                        int sald = scanner.nextInt();
                        if(sald > saldo){
                            System.out.println("no tienes suficiente cantidad");
                        }else
                         saldo = saldo - sald;
                        
                        System.out.println("4. salir");
                     opc = scanner.nextInt();
                       
                     break;
                     
                 case 4:
                     System.out.println("escoge otra opcion");
                      opc = scanner.nextInt();
                    break;
                     
                 default:
                     System.out.println("Eleccion no existente escoge otra opcion");
                    opc = scanner.nextInt();
               } 
           }     
    
               
        
    }
}
