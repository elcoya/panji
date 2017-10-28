package ar.org.panji.model;

public class RondaDeJuego {

	private Alumno alumno;
	private Texto texto;
	
	public RondaDeJuego(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public Texto getTexto() {
		return texto;
	}
	
	public void setTexto(Texto texto) {
		this.texto = texto;
	}
	
}
