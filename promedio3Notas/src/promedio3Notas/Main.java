package promedio3Notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	double nota1=0, nota2=0, nota3=0, total ;
	
	
	nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
	
	nota1 = d(leer("Ingrese la nota 1"));
	
	nota2 = d(leer("Ingrese la nota 2"));
	
	nota3 = d(leer("Ingrese la nota 3"));
	
	
	total = (nota1 + nota2 + nota3) / 3;
	
	mostrar("la nota final es: "+total);
	
		

	}
	
	
	public static String leer(String texto){
		
		texto = JOptionPane.showInputDialog(texto);		
		
		return texto;
	}
	
	public static void mostrar(String texto) {
		
		JOptionPane.showMessageDialog(null, texto);
		
	}
	
	public static double d(String texto) {
		
		double valor = Double.parseDouble(texto);
		
		return valor;
	}

}
