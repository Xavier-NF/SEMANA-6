import java.util.Scanner;
public class Ejercicio6 {
public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
    System.out.print("Ingrese una edad: ");
    int edad = entrada.nextInt();
     
    if( edad <= 18 ){
    if( edad >= 15){
    System.out.println("Apto para participar");
    }
    }
}
 
System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIf