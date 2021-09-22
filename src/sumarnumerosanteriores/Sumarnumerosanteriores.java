package sumarnumerosanteriores;
/**
*
* @author
*/
import java.util.Scanner;
public class Sumarnumerosanteriores {
    public static void main(String[] args) {
        int resultado=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduzca un número");
     int numero = sc.nextInt();
     resultado= (numero*(numero+1))/2;
        System.out.println("El resultado es: " + resultado);
        
    }//Fin del main

}//Fin de la clase
