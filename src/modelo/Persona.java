package modelo;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String hobbie;
	private String editorCodigo;
	private String sistemaOperativo;
	
	
	public Persona(String nombre, String apellido, int edad, String hobbie, String editorCodigo,
			String sistemaOperativo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.hobbie = hobbie;
		this.editorCodigo = editorCodigo;
		this.sistemaOperativo = sistemaOperativo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHobbie() {
		return hobbie;
	}


	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}


	public String getEditorCodigo() {
		return editorCodigo;
	}


	public void setEditorCodigo(String editorCodigo) {
		this.editorCodigo = editorCodigo;
	}


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", hobbie=" + hobbie
				+ ", editorCodigo=" + editorCodigo + ", sistemaOperativo=" + sistemaOperativo + "]";
	}
	
	
	

}
