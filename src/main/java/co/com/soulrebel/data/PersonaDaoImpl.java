
package co.com.soulrebel.data;

import co.com.soulrebel.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;


@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext (unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> encontrarTodasLasPersonas() {
        return em.createNamedQuery("Persona.encontrarTodasPersonas").getResultList();
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        return em.find(Persona.class,persona.getIdPersona());
    }

    @Override
    public void insertarPersona(Persona persona) {
        em.persist(persona);
        em.flush();
    }

    @Override
    public void actualizarPersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        em.remove(em.merge(persona));
    }
    
}
