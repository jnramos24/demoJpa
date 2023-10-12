package demoJPA;

import demoJPA.entidades.Publicacion;
import demoJPA.servicio.PublicacionServicio;

public class ExampleJpa {

	public static void main(String[] args) {
		
		PublicacionServicio publicacionServicio = new PublicacionServicio();
		
		//Publicacion publicacion = new Publicacion("Java-API","Vamos a ver una introduccion a JAVA-API","Maxi");
		
		//publicacionServicio.crearPublicacion(publicacion);
		
		publicacionServicio.listarPublicaciones();
		
		System.out.println("");
		
		publicacionServicio.mostrarPublicacion(2);
		
		
	}
}
