import java.util.*;
public class adivinaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 //Refundicion; al colocar (int), convierte a entero lo que tiene en los parentesis siguientes
		int aleatorio=(int)(Math.random()*100);
		/*random, devuelve un numero aleatorio decimal entre 0 y 1, como ejem 0.456
		 * entonces para transformar este numero aleatorio en un numero entero, 
		 * se debe multiplicar por 100, y ahora nos devolvera por ejemplo; 95.345.
		 */

		//System.out.println(aleatorio); Instruccion para imprimir el numero aleatorio
		
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio) {
			
			intentos++;
			
			System.out.println("Ingrese un número: ");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Intenta con un número MENOR");
				
			}
			else if(aleatorio>numero) {
				
				System.out.println("Intenta con un número MAYOR");
			}
			
		}
		
		System.out.println("CORRECTO. Lo has conseguido en " + intentos + " intentos ");
		
		
	}

}
