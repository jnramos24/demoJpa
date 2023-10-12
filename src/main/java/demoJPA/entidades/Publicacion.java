package demoJPA.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Publicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPublicacion;

	@Column
	private String titulo;
	@Column
	private String contenido;
	@Column(name = "usuario")
	private String nombreUsuario;

	public Publicacion() {
		super();
	}

	public Publicacion(String titulo, String contenido, String nombreUsuario) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.nombreUsuario = nombreUsuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String toString() {
		return "Publicacion [idPublicacion=" + idPublicacion + ", titulo=" + titulo + ", contenido=" + contenido
				+ ", nombreUsuario=" + nombreUsuario + "]";
	}

	
}
