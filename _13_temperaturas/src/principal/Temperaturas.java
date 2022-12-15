package principal;

public class Temperaturas {

	public static void main(String[] args) {
		// cuantas ciudades tienen una temperatura superior a la media ?? 
		
		double [] temps = {23.7, 11.3, 18.4, 30.1, 28.5, 16.2};
		double media=0;
		int superior=0;
		for (int i=0;i<temps.length; i++) {
			media=media + temps[i];
		}
		media=media/temps.length;
		for (int i=0;i<temps.length; i++) {
			if (temps[i] > media) {
				superior++;
			}
			
		}
		System.out.println("La media es "+media+" y hay "+superior+" ciudades con una temperatura superior");
	}

}
