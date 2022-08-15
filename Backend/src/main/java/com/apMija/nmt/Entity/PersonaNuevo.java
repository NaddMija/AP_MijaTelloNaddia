/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apMija.nmt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PersonaNuevo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nombreP;
    private String apellidoP;
    private String imgP;
    private String positionP;
    private String aboutMeP;
    
    //Constructores

    public PersonaNuevo() {
    }

    public PersonaNuevo(String nombreP, String apellidoP, String imgP, String positionP, String aboutMeP) {
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.imgP = imgP;
        this.positionP = positionP;
        this.aboutMeP = aboutMeP;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getPositionP() {
        return positionP;
    }

    public void setPositionP(String positionP) {
        this.positionP = positionP;
    }

    public String getAboutMeP() {
        return aboutMeP;
    }

    public void setAboutMeP(String aboutMeP) {
        this.aboutMeP = aboutMeP;
    }
    
}