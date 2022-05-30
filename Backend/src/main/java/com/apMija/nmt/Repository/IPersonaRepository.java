
package com.apMija.nmt.Repository;

import com.apMija.nmt.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface IPersonaRepository  extends JpaRepository<Persona, Long >{
    
}
