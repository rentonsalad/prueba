package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void verSiSeGuardaUnLibro() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		assertTrue(biblio.guardarLibro(librito));

	}

	@org.junit.Test
	public void verSiSePrestaUnLibro() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		biblio.guardarLibro(librito);

		assertTrue(biblio.prestarLibro(41327328, "tomas", "palen", 123, 1));
	}

	@org.junit.Test
	public void verSiEncuentraAUnAlumno() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		biblio.guardarLibro(librito);
		Alumno alumni = new Alumno(41327328, "tomas", "palen");

		biblio.buscarAlumno(41327328);
	}

	@org.junit.Test
	public void verSiEncuentraAUnAlumnoQueLlevoUnLibro() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		biblio.guardarLibro(librito);
		Alumno alumni = new Alumno(41327328, "tomas", "palen");

		biblio.prestarLibro(41327328, 123);

		assertEquals(biblio.buscarAlumno(41327328), alumni);

	}

	@org.junit.Test
	public void verSiUnAlumnoTieneUnLibro() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		biblio.guardarLibro(librito);
		Alumno alumni = new Alumno(41327328, "tomas", "palen");

		biblio.prestarLibro(123, alumni, 1);

		assertEquals(librito, alumni.buscarLibro(123));

	}

	@org.junit.Test
	public void verSiSeRegistraUnPrestamo() {
		Biblioteca biblio = new Biblioteca();

		Libro librito = new Libro(Categorias.Geografia, "geografia", 123, "geografo");

		biblio.guardarLibro(librito);
		Alumno alumni = new Alumno(41327328, "tomas", "palen");
		assertTrue(biblio.registrarPrestamo(1, librito, alumni));

	}

}
