
public class ManipulaCadenas3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String alumno1, alumno2;
		
		alumno1="David";
		alumno2="david";
		
		/*PARA ESTE METODO DE SOLO EQUALS
		 * si yo pongo "david", ahora las cadenas ya no son iguales y devolvera false
		 */
		//System.out.println(alumno1.equals(alumno2));
		
		
		/*SEGUNDO METODO EQUALSIGNORECASE
		 * este metodo ignora si esta escrito con mayuscula o minuscula, 
		 * mientras las cadenas sean iguales imprimira true
		 */
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
	}

}
