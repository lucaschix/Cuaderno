import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CuadernoTest {

    private Cuaderno cuaderno;

    @BeforeEach
    void setUp() {
        cuaderno = new Cuaderno(5, new ArrayList<>());
    }

    @Test
    void testEscribir() {
        assertDoesNotThrow(() -> cuaderno.escribir(), "El método escribir no debería lanzar excepciones.");
    }

    @Test
    void testCrearHoja() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);

        assertEquals(1, cuaderno.getHojasList().size(), "Debe haber 1 hoja en el cuaderno");
        assertEquals("Blanco", cuaderno.getHojasList().get(0).getColor(), "El color de la hoja debe ser Blanco");
        assertEquals("Contenido inicial", cuaderno.getHojasList().get(0).getContenido(), "El contenido debe ser 'Contenido inicial'");
    }

    @Test
    void testQuitarHojaConHojas() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido de prueba", 1);
        cuaderno.quitarHoja();

        assertEquals(0, cuaderno.getHojasList().size(), "El cuaderno no debería tener hojas después de quitar una");
    }

    @Test
    void testQuitarHojaSinHojas() {
        cuaderno.quitarHoja();

        assertEquals(0, cuaderno.getHojasList().size(), "El cuaderno debería seguir sin hojas");
    }

    @Test
    void testEliminarHojaPorNumeroExistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);
        cuaderno.eliminarHojaPorNumero(1);

        assertEquals(0, cuaderno.getHojasList().size(), "La lista de hojas debería estar vacía después de eliminar la hoja por número");
    }

    @Test
    void testEliminarHojaPorNumeroInexistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);
        cuaderno.eliminarHojaPorNumero(2);

        assertEquals(1, cuaderno.getHojasList().size(), "La lista de hojas no debería cambiar al intentar eliminar un número inexistente");
    }

    @Test
    void testModificarContenidoEnHojaExistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);
        cuaderno.modificaContenidoEnHoja(1, "Nuevo contenido");

        assertEquals("Nuevo contenido", cuaderno.getHojasList().get(0).getContenido(), "El contenido de la hoja debería ser actualizado a 'Nuevo contenido'");
    }

    @Test
    void testModificarContenidoEnHojaInexistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);
        cuaderno.modificaContenidoEnHoja(2, "Nuevo contenido");

        assertEquals("Contenido inicial", cuaderno.getHojasList().get(0).getContenido(), "El contenido de la hoja no debería cambiar para una hoja inexistente");
    }

    @Test
    void testMostrarInformacionHojaPorNumeroDeHojaExistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);

        assertDoesNotThrow(() -> cuaderno.mostrarInformacionHojaPorNumeroDeHoja(1), "La búsqueda de hoja existente no debería lanzar excepciones");
    }

    @Test
    void testMostrarInformacionHojaPorNumeroDeHojaInexistente() {
        cuaderno.crearHoja("Blanco", 21, 29, "Contenido inicial", 1);

        assertDoesNotThrow(() -> cuaderno.mostrarInformacionHojaPorNumeroDeHoja(2), "La búsqueda de hoja inexistente no debería lanzar excepciones");
    }
}
