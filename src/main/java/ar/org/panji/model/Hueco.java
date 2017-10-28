package ar.org.panji.model;

import java.util.List;

public class Hueco {

	private List<Opcion> opciones;
	
	private Opcion seleccion;
	
	public Hueco() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Opcion> getOpciones() {
		return opciones;
	}
	
	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}
	
	public Opcion getSeleccion() {
		return seleccion;
	}
	
	public void setSeleccion(Opcion seleccion) {
		this.seleccion = seleccion;
	}
	
}
