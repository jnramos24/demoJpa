package demoJPA.servicio;

import java.util.List;

import demoJPA.entidades.Publicacion;
import demoJPA.persitencia.PublicacionDao;

public class PublicacionServicio {
	
	private PublicacionDao publicacionDao;
	
	public PublicacionServicio() {
		this.publicacionDao = new PublicacionDao();
	}
	
	public void crearPublicacion(Publicacion publicacion) {
		publicacionDao.crearPublicacion(publicacion);
	}
	
	public void listarPublicaciones() {
		List<Publicacion> publicaciones = publicacionDao.obtenerPublicaciones();
		
		for (Publicacion publicacion : publicaciones) {
			System.out.println(publicacion);
		}
	}
	
	public void mostrarPublicacion(int id) {
		Publicacion publicacion = publicacionDao.obtenerPublicacionPorId(id);
		
		System.out.println(publicacion);
	}

}
