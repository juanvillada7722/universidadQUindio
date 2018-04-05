package esRaizDeEcuacion;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	
		double a, b, c, r, operacion;
		
		a = d(leer("Ingrese el valor de a"));
		b = d(leer("Ingrese el valor de b"));
		c = d(leer("Ingrese el valor de c"));
		r = d(leer("Ingrese el valor de r"));
		
		operacion = (a * Math.pow(r, 2)) + (b*r) + (c);
		
	if (operacion == 0) {
		
		mostrar(r + " si es raiz de de la ecucacion cuadratica");
	}else {
		
		mostrar(r +  " No es raiz de la ecuacion cuadratica");
	}
		

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
