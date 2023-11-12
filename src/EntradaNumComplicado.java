import javax.swing.*;
public class EntradaNumComplicado {

	public static void main(String[] args) {
		

		String num1=JOptionPane.showInputDialog("Digite un número: ");
		/*Recuerda que showInputDialog, devuelve un string y es estatico, por eso se almacena 
		 * en num1, de tipo string, y se coloca primero la clase JOptionPane y luego ya showInputDialog
		 * si este metodo no devolviera un dato estatico, debes crear un objeto de clase string
		 */
		
		double num2=Double.parseDouble(num1);
		/*este es en metodo que permite convertir un string(num1) a un numero doble(nueva variable tipo doble, que es num2), 
		 * en este caso es necesario un doble porque el metodo sqrt de la clase Math, 
		 * solo acepta numeros tipo double.
		 * El metodo parseDouble tambien es estatico, por lo cual va primero la clase Double y luego el metodo
		 */
		
		System.out.print("La raíz cuadrada de " + num2 + " es ");
		
		System.out.printf("%1.3f", Math.sqrt(num2));
		//aplicar el formato de 3 decimales, al resultado de Math.sqrt de num2
		
	}

}
