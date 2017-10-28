package ar.org.panji.random;

public class SelectorDeEjercicio {

	public static final int CANTIDAD_DE_TEXTOS = 2;
	
	public String getRutaDelTextoFuente() {
		Double nro = (Math.random() * 100);
		int caso = (nro.intValue() % CANTIDAD_DE_TEXTOS) + 1;
		
		return String.format("textos/texto-%02d.txt", caso);
	}
	
}
