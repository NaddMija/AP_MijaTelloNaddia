/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apMija.nmt.Controller;

import com.apMija.nmt.Dto.dtoPersonaNuevo;
import com.apMija.nmt.Entity.PersonaNuevo;
import com.apMija.nmt.Security.Controller.Mensaje;
import com.apMija.nmt.Service.SPersonaNuevo;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("personaNuevo")
@CrossOrigin (origins = "https://front-mijatello.web.app/")
public class CPersonaNuevo {
    
    @Autowired
    SPersonaNuevo sPersonaNuevo;

    @GetMapping("/lista")
    public ResponseEntity<List< PersonaNuevo>> list() {
        List<PersonaNuevo> list = sPersonaNuevo.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<PersonaNuevo> getById(@PathVariable("id") int id) {
        if (!sPersonaNuevo.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        PersonaNuevo personaNuevo = sPersonaNuevo.getOne(id).get();
        return new ResponseEntity(personaNuevo, HttpStatus.OK);
    }
   

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPersonaNuevo dtopers) {
        if (StringUtils.isBlank(dtopers.getNombreP())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sPersonaNuevo.existsByNombreP(dtopers.getNombreP())) {
            return new ResponseEntity(new Mensaje("Esa persona existe"), HttpStatus.BAD_REQUEST);
        }

        PersonaNuevo persona = new PersonaNuevo(dtopers.getNombreP(), dtopers.getApellidoP(), dtopers.getImgP(), dtopers.getPositionP(), dtopers.getAboutMeP());
        sPersonaNuevo.save(persona);

        return new ResponseEntity(new Mensaje("Persona agregada!"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersonaNuevo dtopers) {
        //validamos ID
        if (!sPersonaNuevo.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //compara nombres de experiencias
        if (sPersonaNuevo.existsByNombreP(dtopers.getNombreP()) && sPersonaNuevo.getByNombreP(dtopers.getNombreP()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        // no puede estar vacio
        if (StringUtils.isBlank(dtopers.getNombreP())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        PersonaNuevo personaNuevo = sPersonaNuevo.getOne(id).get();
        personaNuevo.setNombreP(dtopers.getNombreP());
        personaNuevo.setApellidoP(dtopers.getApellidoP());
        personaNuevo.setImgP(dtopers.getImgP());
        personaNuevo.setPositionP(dtopers.getPositionP());
        personaNuevo.setAboutMeP(dtopers.getAboutMeP());

        sPersonaNuevo.save(personaNuevo);
        return new ResponseEntity(new Mensaje("Persona Actualizado"), HttpStatus.OK);
    }

}