package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import model.Curso;
/*
1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Mostrar todos los cursos
7.- Salir
*/
public class CursosService {

	String ruta ="C:\\ficheroseclipse\\cursos.txt";
	
	public boolean agregarCurso(Curso curso) {
		try(FileReader fr=new FileReader(ruta);
			BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				//si encontramos curso con dicho nombre, salimos
				if(s.split("[|]")[0].equals(curso.getNombre())) {
					return false;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		//aqui llega si no encuentra curso, y entonces lo tiene
		//que grabar en el fichero
		try(FileOutputStream fos=new FileOutputStream(ruta,true);
			PrintStream out=new PrintStream(fos);){
			out.println(curso.getNombre()+"|"+curso.getPrecio()+"|"+curso.getDuracion()+"|"+curso.getTematica());
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return true;
		
	}
	
	
	
	
	public Curso buscarCurso(String cursobuscado ) {
		
	}
	
	public double duracionMedia() {
		
		
	}
	
	public List<Curso> cursosTematica(String tematica) {
		
		
	}
	
	public void  eliminarCurso(int precio) {
		
	}

	
	public ArrayList<Curso>  mostrarTodos () {
			 
	}
}
