package ar.edu.unlam.dominio;

public class Prestamo {

	private Integer id;
	private Libro libroInvolucrado;
	private Alumno alumno;

	public Prestamo(int id, Libro libroInvolucrado, Alumno alumno) {
		super();
		this.id = id;
		this.libroInvolucrado = libroInvolucrado;
		this.alumno = alumno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Libro getLibroInvolucrado() {
		return libroInvolucrado;
	}

	public void setLibroInvolucrado(Libro libroInvolucrado) {
		this.libroInvolucrado = libroInvolucrado;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
