import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear algunas hojas
        Hoja hoja1 = new Hoja("Blanca", 30, 20, "Contenido de la hoja 1", 1);
        Hoja hoja2 = new Hoja("Amarilla", 30, 20, "Contenido de la hoja 2", 2);
        Hoja hoja3 = new Hoja("Azul", 30, 20, "Contenido de la hoja 3", 3);

        // Crear una lista de hojas
        List<Hoja> listaHojas = new ArrayList<>();
        listaHojas.add(hoja1);
        listaHojas.add(hoja2);
        listaHojas.add(hoja3);

        // Crear un cuaderno con 3 hojas
        Cuaderno cuaderno = new Cuaderno(3, listaHojas);

        // Mostrar la información del cuaderno
        System.out.println("Cuaderno antes de modificar:");
        System.out.println(cuaderno);

        // Mostrar la información de una hoja específica
        System.out.println("\nMostrar información de la hoja 2:");
        cuaderno.mostrarInformacionHojaPorNumeroDeHoja(2);

        // Modificar el contenido de la hoja 2
        System.out.println("\nModificando contenido de la hoja 2...");
        cuaderno.modificaContenidoEnHoja(2, "Nuevo contenido en la hoja 2");

        // Mostrar la información de la hoja 2 después de la modificación
        System.out.println("\nMostrar información de la hoja 2 después de la modificación:");
        cuaderno.mostrarInformacionHojaPorNumeroDeHoja(2);

        // Agregar una nueva hoja

        cuaderno.crearHoja("Verde", 30, 20, "Contenido de la hoja 4", 4);

        // Mostrar la información del cuaderno después de agregar una hoja
        System.out.println("\nCuaderno después de agregar una hoja:");
        System.out.println(cuaderno);

        // Eliminar la hoja con número 3
        System.out.println("\nEliminando la hoja con número 3...");
        cuaderno.eliminarHojaPorNumero(3);

        // Mostrar la información del cuaderno después de eliminar una hoja
        System.out.println("\nCuaderno después de eliminar la hoja 3:");
        System.out.println(cuaderno);

        // Escribir en el cuaderno
        System.out.println("\nEscribiendo en el cuaderno...");
        cuaderno.escribir();

        // Intentar eliminar una hoja que no existe
        System.out.println("\nIntentando eliminar una hoja que no existe...");
        cuaderno.eliminarHojaPorNumero(10);
    }
}
