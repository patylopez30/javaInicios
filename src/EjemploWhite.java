import javax.swing.*;
public class EjemploWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Patti";
		
		String pass="";
		
		while (clave.equals(pass)==false) { //no distingue entre mayusculas y minusculas, tienes que ponerlo exacto
		
			pass=JOptionPane.showInputDialog("Ingrese una contraseña: ");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseña Incorrecta");
			}
		}
		
		System.out.println("Contraseña CORRECTA. Acceso Permitido");
	}

}
