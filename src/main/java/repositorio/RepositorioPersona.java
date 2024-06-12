package repositorio;

import modelo.Persona;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPersona {
    private Map<String, String> objectDb = new HashMap<>();

    public String crearPersona(Persona persona) {
        objectDb.put(persona.getRut(), persona.getNombre());
        return "Persona creada";
    }

    public String actualizarPersona(Persona persona) {
        objectDb.put(persona.getRut(), persona.getNombre());
        return "Persona actualizada";
    }

    public Map<String, String> listarPersonas() {
        return objectDb;
    }

    public String eliminarPersona(Persona persona) {
        objectDb.remove(persona.getRut());
        return "Persona eliminada";
    }
}
