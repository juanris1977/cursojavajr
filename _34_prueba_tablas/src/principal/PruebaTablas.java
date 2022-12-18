package principal;

import java.util.Collection;  // subir
import java.util.HashMap;
import java.util.Set;

public class PruebaTablas {

	public static void main(String[] args) {

		HashMap<Integer,String> tabla = new HashMap<>();
		tabla.put(120, "Lunes");
		tabla.put(1, "Martes");
		tabla.put(250, "Miercoles");
		tabla.put(100, "Jueves");
		
	//	System.out.println("eliminamos: "+ tabla.remove(300));
		// recorre los valores de un hashmaps
		Collection<String> col=tabla.values();   // Ojo que hashmap no tiene un orden establecido, puede darte los valores en cualquier orden 
		for (String s:col) {
			System.out.println(s);
		}
		
		
		// recorrer claves de un hashmap
		
		Set<Integer> claves=tabla.keySet();
		for (Integer c:claves) {
			System.out.println(c);
		}
		
		
				

	}

}
