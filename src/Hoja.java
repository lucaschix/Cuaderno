public class Hoja {

	private String color;
	private int alto;
	private int ancho;
	private String contenido;
	private int numero;

	// Constructor
	public Hoja(String color, int alto, int ancho, String contenido, int numero) {
		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.contenido = contenido;
		this.numero = numero;
	}

	// Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Método toString
	@Override
	public String toString() {
		return "Hoja{" +
				"color='" + color + '\'' +
				", alto=" + alto +
				", ancho=" + ancho +
				", contenido='" + contenido + '\'' +
				", numero=" + numero +
				'}';
	}
}
