/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apMija.nmt.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersonaNuevo {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String apellidoP;
    @NotBlank
    private String imgP;
    @NotBlank
    private String positionP;
    @NotBlank
    private String aboutMeP;

    //Constructor

    public dtoPersonaNuevo() {
    }

    public dtoPersonaNuevo(String nombreP, String apellidoP, String imgP, String positionP, String aboutMeP) {
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.imgP = imgP;
        this.positionP = positionP;
        this.aboutMeP = aboutMeP;
    }
    
    //GETTER Y SETTER

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