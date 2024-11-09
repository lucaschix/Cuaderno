import java.util.List;

public class Cuaderno {

	private int hojas;
	private List<Hoja> Hojas;

	// Constructor
	public Cuaderno(int hojas, List<Hoja> Hojas) {
		this.hojas = hojas;
		this.Hojas = Hojas;
	}

	// Getters y Setters
	public int getHojas() {
		return hojas;
	}

	public void setHojas(int hojas) {
		this.hojas = hojas;
	}

	public List<Hoja> getHojasList() {
		return Hojas;
	}

	public void setHojasList(List<Hoja> Hojas) {
		this.Hojas = Hojas;
	}

	// Métodos
	public void escribir() {
		// Implementación de escribir en el cuaderno
		System.out.println("Escribiendo en el cuaderno...");
	}

	public void quitarHoja() {
		// Implementación de quitar una hoja del cuaderno
		if (!Hojas.isEmpty()) {
			Hojas.remove(Hojas.size() - 1); // Eliminar la última hoja
			System.out.println("Hoja quitada.");
		} else {
			System.out.println("No hay hojas para quitar.");
		}
	}

	@Override
	public String toString() {
		return "Cuaderno{" +
				"hojas=" + hojas +
				", Hojas=" + Hojas +
				'}';
	}




	public void crearHoja(String color, int alto, int ancho, String contenido, int numero) {
		Hoja newhoja = new Hoja(color,alto,  ancho,contenido,numero);
		Hojas.add(newhoja);
		System.out.println("Hoja agregada exitosamente:"+ newhoja);
	}

	public void eliminarHojaPorNumero(int numero) {

		for (Hoja hoja : Hojas) {
			if (hoja.getNumero() == numero) {
				Hojas.remove(hoja);
				System.out.println("Hoja con número " + numero + " eliminada.");
				break;
			}else{
				System.out.println("Hoja no encontrada. Prueba con otro número de hoja.");
			}
		}
	}

	public void modificaContenidoEnHoja(int numhoja,String newContenido){
		for(Hoja hoja : Hojas){
			if(hoja.getNumero()== numhoja){
				hoja.setContenido(newContenido);
				System.out.println("datos de la hoja actualizados correctamente"+hoja);
				break;
			}else{
				System.out.println("Hoja no encontrada no se puede modificar su contenido");
			}
		}
	}

	public void mostrarInformacionHojaPorNumeroDeHoja(int numhoja){
		for(Hoja hoja : Hojas){
			if(hoja.getNumero()== numhoja){
				hoja.toString();
				break;
			}else{
				System.out.println("Hoja no encontrada");
			}
		}
	}
}

