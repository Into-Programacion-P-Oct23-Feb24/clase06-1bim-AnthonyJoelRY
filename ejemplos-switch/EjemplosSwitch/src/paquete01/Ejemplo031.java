/*

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese nombre");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese apellido");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese Universidad");
        String universidad = entrada.nextLine();
        
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        
       
     
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch(valor){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':           
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                
               System.out.printf("%s %s con edad %d, es estudainte de %s \n ", 
                        nombre.toUpperCase(),apellido.toUpperCase(),edad, universidad);
                break;    
            
            default:
                System.out.printf("%s %s con edad %d, es estudainte de %s \n ", 
                        nombre.toLowerCase(),apellido,edad, universidad);
                break;
                
        }
        
    }
}
