package ar.edu.unlam.dominio;

public class Alumno {

	private int dni;
	private String apellido;
	private String nombre;
	private Libro librosEnMochila[];

	public Alumno(int dni, String apellido, String nombre) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.librosEnMochila = new Libro[2];
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro[] getLibros() {
		return librosEnMochila;
	}

	public void setLibros(Libro[] libros) {
		this.librosEnMochila = libros;
	}

//	public Libro buscarLibro(int codigo) {
//		Libro aux = null;
//		for (int i = 0; i < librosEnMochila.length; i++) {
//			if (librosEnMochila != null && librosEnMochila[i].getCodigo() == codigo) {
//				aux = librosEnMochila[i];
//				break;
//			}
//		}
//		return aux;
//	}

	
}
