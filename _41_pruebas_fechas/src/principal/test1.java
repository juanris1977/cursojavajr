package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();
		Date d2 = new Date (3052245522323L);  // milisegundos desde 1 enero 1970 , si el número es muy grande, la L , lo "convierte" a Long
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		if (d1.before(d2)) {
			System.out.println("fecha antigua: " +d1);
			System.out.println("fecha moderna: " +d2);
		}else {
			System.out.println("fecha antigua: " +d2);
			System.out.println("fecha moderna: " +d1);
		}
		//formateado de fechas
		SimpleDateFormat formatofecha=new SimpleDateFormat("dd-MM-yyyy h:mm:ss");
		
		System.out.println(formatofecha.format(d1));
		System.out.println(formatofecha.format(d2));

		// parseado de fechas
		
		SimpleDateFormat formafecha=new SimpleDateFormat("dd-MM-yyyy");
		String f ="11-08-2011";
		Date mifecha = formafecha.parse(f);
		
		System.out.println(mifecha);
		System.out.println(formatofecha.format(mifecha));
	}

}
