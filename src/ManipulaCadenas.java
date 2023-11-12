
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		//PRIMER EJERCICIO
		//String nombre="Juan";
		//System.out.println("Mi nombre es " + nombre);
		
		
		//se puede cambiar el nombre a uno mas largo
		//String nombre="Juan";
		
		String nombre="Felipe Juan Froilán de Todos los Santos";
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras"); //ESTE METODO TAMBIEN CUENTA LOS ESPACIOS DEL NOMBRE
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		
		
		//Como hacer que me diga la ultima letra, de cualquier nombre sin importar la longitud que tenga
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
		
		
	}

}
