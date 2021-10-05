package ar.edu.unlam.dominio;

public class Biblioteca {

	private Libro libros[];
	private Alumno alumnos[];
	private Prestamo prestamos[];

	public Biblioteca() {
		super();
		libros = new Libro[3];
		alumnos = new Alumno[100];
		this.prestamos = new Prestamo[100];

	}

	public boolean guardarLibro(Libro libro) {
		boolean aux = false;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libros[i] = libro;
				aux = true;
				break;
			}
		}
		return aux;

	}

	public Boolean guardarAlumno(Integer dni, String nombre, String apellido) {
		Boolean aux = false;
		Alumno alu = new Alumno(dni, apellido, nombre);
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				aux = true;
				break;
			}
		}
		return aux;
	}

	public Alumno buscarAlumno(Integer dni) {
		Alumno aux = null;
		for (int i = 0; i < alumnos.length; i++) {
			if (dni == alumnos[i].getDni()) {
				aux = alumnos[i];
				break;
			}
		}
		return aux;
	}

	public Libro buscarLibro(Integer codigoLibro) {
		Libro aux = null;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getCodigo().equals(codigoLibro)) {
				aux = libros[i];
				libros[i] = null;
				break;
			}
		}
		return aux;
	}

	public Boolean prestarLibro(Integer dni, String nombre, String apellido, Integer codigoLibro, Integer idPrestamo) {
		Boolean alumnoGuardado = guardarAlumno(dni, nombre, apellido);
		Alumno alu = buscarAlumno(dni);
		Libro libro = buscarLibro(codigoLibro);

		Boolean prestado = false;
		Boolean registradoYPrestado = false;

		if (alumnoGuardado) {
			for (int i = 0; i < alu.getLibros().length; i++) {
				if (alu.getLibros()[i] == null) {
					alu.getLibros()[i] = libro;
					prestado = true;
					break;
				}
			}
			Boolean registrado = registrarPrestamo(idPrestamo, libro, alu);
			if (registrado==true && prestado==true) {
				registradoYPrestado = true;
			}
		}

		return registradoYPrestado;
	}

	public Boolean registrarPrestamo(Integer idPrestamo, Libro libroInvolucrado, Alumno alu) {
		Boolean aux = false;
		Prestamo prestamo = new Prestamo(idPrestamo, libroInvolucrado, alu);
		for (int i = 0; i < prestamos.length; i++) {
			if (prestamos[i] == null) {
				prestamos[i] = prestamo;
				aux=true;
				break;
			}
		}
		return aux;
	}

}
