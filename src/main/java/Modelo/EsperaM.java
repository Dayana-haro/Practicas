/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class EsperaM {
    
   private String NombresCompletos;
   private String Cedula;
   private String Edad;
   private String GrupoPrioritario;
   private String Telefonos;
   private String Observaciones;
   private String Celular;

   public EsperaM(){
       
   }

    public EsperaM(String NombresCompletos, String Cedula, String Edad, String GrupoPrioritario, String Telefonos, String Observaciones, String Celular) {
        this.NombresCompletos = NombresCompletos;
        this.Cedula = Cedula;
        this.Edad = Edad;
        this.GrupoPrioritario = GrupoPrioritario;
        this.Telefonos = Telefonos;
        this.Observaciones = Observaciones;
        this.Celular = Celular;
    }

    public String getNombresCompletos() {
        return NombresCompletos;
    }

    public void setNombresCompletos(String NombresCompletos) {
        this.NombresCompletos = NombresCompletos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getGrupoPrioritario() {
        return GrupoPrioritario;
    }

    public void setGrupoPrioritario(String GrupoPrioritario) {
        this.GrupoPrioritario = GrupoPrioritario;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
   
   
  
    
    
    
    
    
}
