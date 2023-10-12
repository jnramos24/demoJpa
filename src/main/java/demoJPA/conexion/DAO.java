package demoJPA.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	
	private static final String PERSISTENCE_UNIT_NAME = "persistenciaPublicacion";
	private static EntityManagerFactory factory;
	
	protected DAO() {
		
	}
	
	public static EntityManager devolverEntityManager() {
		
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory.createEntityManager();
	}
	
	public static void cerrarEntityManagerFactory() {
		if(factory != null && factory.isOpen()) {
			factory.close();
		}
	}

}
