/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apMija.nmt.Repository;

import com.apMija.nmt.Entity.PersonaNuevo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersonaNuevo extends JpaRepository<PersonaNuevo, Integer>{
    public Optional<PersonaNuevo> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}