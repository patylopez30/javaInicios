import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("Ingrese su nombre: ");
		
		String edad=JOptionPane.showInputDialog("Ingrese su edad: ");
		/*aqui se puso edad en un string, porque "showInputDialog", devuelve un string, 
		 * por lo cual daria un error al intentar guardarlo en un entero tipo "int edad"
		 */
		
		int edad_usuario=Integer.parseInt(edad);
		/*Metodo "parseInt", te convierte un valor(en este caso un string) a un numero entero  
		 * y este metodo pertenece a la clase Integer, la cual pertenece al paquete "java.lang"
		 * por lo que no requiere que lo importes
		 */
		
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario) + " años");
		 
		
		
	}

}
