import javax.swing.*;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";//estamos inicializando una variable para texto
		
		do {
			
			genero=JOptionPane.showInputDialog("Ingrese su género (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			
			pesoideal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoideal + " kg");
	}

}
