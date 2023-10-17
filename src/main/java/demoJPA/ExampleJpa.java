package demoJPA;

import demoJPA.entidades.Publicacion;
import demoJPA.persitencia.PublicacionDao;
import demoJPA.servicio.PublicacionServicio;

public class ExampleJpa {

	public static void main(String[] args) {
		
		PublicacionServicio publicacionServicio = new PublicacionServicio();
		
		//Publicacion publicacion = new Publicacion("Java-API","Vamos a ver una introduccion a JAVA-API","Maxi");
		
		//publicacionServicio.crearPublicacion(publicacion);
		
		publicacionServicio.listarPublicaciones();
		
		System.out.println("");
		
//		Publicacion publicacion = publicacionServicio.obtenerPublicacionPorId(3);
//		
//		publicacion.setContenido("Contenido actualizado");
//		publicacion.setNombreUsuario("Nuevo Maxi");
//		publicacion.setTitulo("Titulo actualizado");
//		
//		publicacionServicio.actualizarPublicacion(publicacion);
		
		publicacionServicio.eliminarPublicacion(3);
		
		publicacionServicio.listarPublicaciones();
		
		
	}
}
