package ar.org.panji.model;

import java.util.List;

public class Texto {

	/*
	 * Ejemplo:
	 * 
	 * Texto:
	 * Pablito clavó un ______, qué ______ de _______ clavó Pablito.
	 * Pablito clavó un #%#, qué #%# de #%# clavó Pablito.
	 * 
	 * [hueco1, hueco2, hueco3]
	 */
	
	public static final int PUNTAJE_TOTAL = 100;

	public Texto() {
	}

	private String texto;
	private List<Hueco> huecos;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<Hueco> getHuecos() {
		return huecos;
	}

	public void setHuecos(List<Hueco> huecos) {
		this.huecos = huecos;
	}
	
	public int getPuntajeLogrado() {
		// Calcular el % de huecos resueltos y multiplicarlo por el puntaje total (PUNTAJE_TOTAL) corresponidente al texto
		return 0;
	}

}
