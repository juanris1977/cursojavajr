package ej_04_contar_numeros_cadena;

import java.util.HashSet;

public class ContarNumeroCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		String valores = "11,2,6,7,3,8,3,10,1,8,3";
		
		
		HashSet<Integer> conjunto = new HashSet <>();
		
		
		for (int i=0;i<valores.split(",").length;i++) {
			if(conjunto.add(Integer.parseInt(valores.split(",")[i]))) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+ " valores distintos");
		
		
	}

}