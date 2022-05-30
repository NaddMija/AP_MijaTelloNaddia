
package com.apMija.nmt.Interface;

import com.apMija.nmt.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    
    public Persona findPersona(Long id);
    
}
