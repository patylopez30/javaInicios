import java.util.*;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		
		
		/*Se tiene que utilizar el objeto perteneciente a la 
		 * clase scanner, delante del método; es decir "entrada"
		 */
		String nombre_usuario=entrada.nextLine(); //recuerda que es "nextLine" para un dato tipo texto
		/*la consola del sistema, se queda en espera de que se introduzca un dato
		 * y cuando lo introduzcamos lo almacenará en la variable "nombre_usuario"
		 */
		
		
		
		System.out.println("Introduce tu edad: ");
		
		int edad=entrada.nextInt(); //recuerda que es "nextInt" para un dato tipo entero
		
		
		
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
		
		
		
		
	}

}
