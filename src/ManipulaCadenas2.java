
public class ManipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String frase="Hoy es un estupendo dia para aprender a programar en Java";
		
		
		String frase_resumen=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..." + " y " +
		frase.substring(29, 57);
		/*el primer parametro es la posicion apartir de la cual quieres empezar a extraer, 
		 * recordar que tambien se empieza desde la posicion cero, y el segundo parametro 
		 * indica la posicion del caracter que NO queremos extraer 
		 */
		
		System.out.println(frase_resumen);
		
		
	}

}
