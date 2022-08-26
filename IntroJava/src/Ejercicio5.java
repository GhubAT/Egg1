import java.util.Scanner;

//Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
//Scanner.


public class Ejercicio5 {

   
    public static void main(String[] args) {
         boolean variable1;
         char variable2;
         double variable3;
         
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa un boolean");
         variable1 = leer.nextBoolean();
         System.out.println("Ingresa un caracter");
         variable2 = leer.next().charAt(0);
         System.out.println("Ingresa un numero real");
         variable3 = leer.nextDouble();
         
         System.out.println("El ejercicio se completo correctamente");
    }
    
}
