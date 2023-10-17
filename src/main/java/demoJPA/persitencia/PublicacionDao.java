package demoJPA.persitencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import demoJPA.conexion.DAO;
import demoJPA.entidades.Publicacion;

public class PublicacionDao extends DAO {

	public void crearPublicacion(Publicacion publicacion) {
		EntityManager entidad = devolverEntityManager();
		EntityTransaction transaccion = null;

		try {
			transaccion = entidad.getTransaction();
			transaccion.begin();

			entidad.persist(publicacion);
			transaccion.commit();
			System.out.println("Se creo la publicacion correctamente");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entidad.close();
		}

	}
	
	public List<Publicacion> obtenerPublicaciones (){
		EntityManager entidad = devolverEntityManager();
		List<Publicacion> publicaciones = null;
		
		try {
			publicaciones = entidad.createQuery("SELECT p FROM Publicacion p",Publicacion.class).getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			entidad.close();
		}
		
		return publicaciones;
	}
	
	public Publicacion obtenerPublicacionPorId(int id) {
		EntityManager entidad = devolverEntityManager();
		Publicacion publicacion = null;
		
		try {
			publicacion = entidad.find(Publicacion.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return publicacion;
	}
	
	public void actualizarPublicacion(Publicacion publicacion) {
		EntityManager entidad = devolverEntityManager();
		EntityTransaction transaction = null;
		
		try {
			transaction = entidad.getTransaction();
			transaction.begin();
			
			entidad.merge(publicacion);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			entidad.close();
		}
	}
	
	public void eliminarPublicacion(int id) {
		EntityManager entidad = devolverEntityManager();
		EntityTransaction transaction = null;
		
		try {
			transaction = entidad.getTransaction();
			transaction.begin();
			Publicacion publicacion = entidad.find(Publicacion.class, id);
			
			entidad.remove(publicacion);
			
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			entidad.close();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
