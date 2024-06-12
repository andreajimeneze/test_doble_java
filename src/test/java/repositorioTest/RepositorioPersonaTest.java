package repositorioTest;

import modelo.Persona;
import org.junit.jupiter.api.Test;
import repositorio.RepositorioPersona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



public class RepositorioPersonaTest {
    private RepositorioPersona repositorioPersona= mock(RepositorioPersona .class);

    @Test
    public void testCrearPersona() {
        Persona juanito = new Persona("19999-3", "Juanito");

        when(repositorioPersona.crearPersona(juanito)).thenReturn("Persona creada");
        String resultadoTest = repositorioPersona.crearPersona(juanito);
        assertEquals("Persona creada", resultadoTest);
        verify(repositorioPersona).crearPersona(juanito);
    }

    @Test
    public void testActualizarPersona() {
        Persona juanito = new Persona("19999-3", "Juanito");

        when(repositorioPersona.actualizarPersona(juanito)).thenReturn("Persona actualizada");
        String resultadoTest = repositorioPersona.actualizarPersona(juanito);
        assertEquals("Persona actualizada", resultadoTest);
        verify(repositorioPersona).actualizarPersona(juanito);

    }

    @Test
    public void testEliminarPersona() {
        Persona juanito = new Persona("19999-3", "Juanito");

        when(repositorioPersona.eliminarPersona(juanito)).thenReturn("Persona eliminada");
        String resultadoTest = repositorioPersona.eliminarPersona(juanito);
        assertEquals("Persona eliminada", resultadoTest);
        verify(repositorioPersona).eliminarPersona(juanito);
    }
}
