
import java.util.Scanner;

//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.
public class Ejercicio6 {

    public static void main(String[] args) {

        int variable1;
        int variable2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        variable1 = leer.nextInt();
        System.out.println("Ingrese un 2° numero entero: ");
        variable2 = leer.nextInt();

        if (variable1 > 25 && variable2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (variable1 > 25) {
            System.out.println("La variable1 es mayores a 25");
        } else if (variable2 > 25) {
            System.out.println("La variable2 es mayores a 25");
        } else {
            System.out.println("Ambas variables son menores a 25");
        }

    }

}
