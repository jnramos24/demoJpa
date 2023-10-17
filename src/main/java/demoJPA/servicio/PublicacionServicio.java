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
	
	public Publicacion obtenerPublicacionPorId(int id) {
		Publicacion publicacion = publicacionDao.obtenerPublicacionPorId(id);
		
		return publicacion;
	}
	
	public void actualizarPublicacion(Publicacion publicacion) {
		publicacionDao.actualizarPublicacion(publicacion);
		System.out.println("La publicacion fue actualizada");
	}
	
	public void eliminarPublicacion(int id) {
		publicacionDao.eliminarPublicacion(id);
		System.out.println("Publicacion eliminada");
	}

	
	
	
	
	
	
	
	
}
