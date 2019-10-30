
package co.com.soulrebel.data;

import co.com.soulrebel.domain.Persona;
import java.util.List;


public interface PersonaDao {
    
    public List<Persona> encontrarTodasLasPersonas();
    
    public Persona encontrarPersona(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
