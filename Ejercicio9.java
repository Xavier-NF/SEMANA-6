import java.util.Scanner;
public class Ejercicio9 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese un numero: ");
    int numero = entrada.nextInt();
     
    if( numero <= 999 & numero >= 100 ){
    System.out.println("Numero de 3 cifras");
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf