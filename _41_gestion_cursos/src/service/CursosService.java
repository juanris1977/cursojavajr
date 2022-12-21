package service;

import java.util.HashSet;

import model.Curso;
/*
1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Salir
*/
public class CursosService {

	HashSet <Curso> curso = new HashSet <>();
	
	public void añadirCurso(String nombre, int duracion, int precio, String tematica) {
		curso.add(new Curso(nombre, duracion, precio, tematica));	
	}
	
	
	public Curso buscarCurso(String cursobuscado ) {
		Curso res = null;
		
		for(Curso c : curso) {
			if (c.getNombre().equalsIgnoreCase(cursobuscado)) {
				res = c;
			}
		}
		
		return res;
	}
	
	public double duracionMedia() {
		double media=0;
		
		for (Curso c : curso) {
			media=media+c.getDuracion();			
		}
		
		return media/curso.size() ;
		
		
	}
	
	public  cursosTematica(String tematica) {
		// quiero devolver un array de nombre de cursos con esa tematica 
		for (Curso c : curso) {
			if (c.getTematica().equalsIgnoreCase(tematica)) {
				res[] = c;
			}
		}
		return res;
		
	}
	
	public void eliminarCurso(double precio) {
		for (Curso c: curso) {
			if (c.getPrecio() > precio) {
				curso.remove(c);
			}
		}
	}
}
