/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;


public class Cliente {
    private String nombre;
    //private String dni;
    //private String nomPrestatario;
    private String aPaterno;
    private String aMaterno;
    private int edad;
    private String sexo;
    private String domicilio;
    private String numTel;
    private String correoElec;
    
    public Cliente() {
        this.nombre = "";
        //this.dni = dni;
        //this.nomPrestatario = nomPrestatario;
        this.aPaterno = "";
        this.aMaterno = "";
        this.edad = 0;
        this.sexo = "";
        this.domicilio = "";
        this.numTel = "";
        this.correoElec = "";
    }
    public Cliente(String nombre, String aPaterno, String aMaterno, int edad, String sexo, String domicilio, String numTel, String correoElec) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.domicilio = domicilio;
        this.numTel = numTel;
        this.correoElec = correoElec;
    }


    

    public String getNombre() {return nombre;}

    //public String getDni() {return dni;}
    //public String getNomPrestatario() {return nomPrestatario;}

    public String getAPaterno() {return aPaterno;}
    public String getAMaterno() {return aMaterno;}
    public int getEdad() {return edad;}
    public String getSexo() {return sexo;}
    public String getDomicilio() {return domicilio;}
    public String getNumTel() {return numTel;}
    public String getCorreoElec() {return correoElec;}
    
    

    
    public void setNombre(String nombre) {this.nombre = nombre;}
    //public void setDni(String dni) {this.dni = dni;}
    //public void setNomPrestatario(String nomPrestatario) {this.nomPrestatario = nomPrestatario;}

    public void setAPaterno(String aPaterno) {this.aPaterno = aPaterno;}
    public void setAMaterno(String aMaterno) {this.aMaterno = aMaterno;}
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public void setSexo(String sexo) {this.sexo = sexo;}
    public void setDomicilio(String domicilio) {this.domicilio = domicilio;}
    public void setNumTel(String numTel) {this.numTel = numTel;}
    public void setCorreoElec(String correoElec) { this.correoElec = correoElec; }


@Override
public String toString() {
    return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", aPaterno='" + aPaterno + '\'' +
            ", aMaterno='" + aMaterno + '\'' +
            ", edad=" + edad +
            ", sexo='" + sexo + '\'' +
            ", domicilio='" + domicilio + '\'' +
            ", numTel='" + numTel + '\'' +
            ", correoElec='" + correoElec + '\'' +
            '}';
    }
}

