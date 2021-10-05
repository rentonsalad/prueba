package ar.edu.unlam.dominio;

public class Libro {

	private Categorias categoria;
	private String nombre;
	private Integer codigo;
	private String apellido;
	
	
	public Libro(Categorias categoria, String nombre, Integer codigo, String apellido) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.codigo = codigo;
		this.apellido = apellido;
	}


	public Categorias getCategoria() {
		return categoria;
	}


	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
