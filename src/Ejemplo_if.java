import java.util.*;
public class Ejemplo_if {

	public static void main(String[] args) {
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		
		int edad=entrada.nextInt();
		
		//Ejemplo1
		/*if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
		}
		else {
			
			System.out.println("Eres menor de edad");
		}*/
		
		
		
		//Ejemplo2
		if (edad<18) {
			
			System.out.println("Eres un adolescente");
			
		}
		
		else if(edad<40) {
			
			System.out.println("Eres joven");
			
		}
		else if(edad<65) {
			
			System.out.println("Eres maduro");
			
		}
		else {
			
			System.out.println("Cuídate por favor");
			
		}
	}

}
