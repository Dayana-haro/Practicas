/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class PersonaModelo {
    private int CI ;
    private String NOMBRE;
    private String APELLIDO;
    private int EDAD;
    private String GRUPO_PRIORITARIO;
    private int TELEFONO;
    private int CELULAR;
    private int ID_DIRECCION;

    public PersonaModelo() {
    }

    public PersonaModelo(int CI, String NOMBRE, String APELLIDO, int EDAD, String GRUPO_PRIORITARIO, int TELEFONO, int CELULAR, int ID_DIRECCION) {
        this.CI = CI;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.EDAD = EDAD;
        this.GRUPO_PRIORITARIO = GRUPO_PRIORITARIO;
        this.TELEFONO = TELEFONO;
        this.CELULAR = CELULAR;
        this.ID_DIRECCION = ID_DIRECCION;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getGRUPO_PRIORITARIO() {
        return GRUPO_PRIORITARIO;
    }

    public void setGRUPO_PRIORITARIO(String GRUPO_PRIORITARIO) {
        this.GRUPO_PRIORITARIO = GRUPO_PRIORITARIO;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public int getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(int CELULAR) {
        this.CELULAR = CELULAR;
    }

    public int getID_DIRECCION() {
        return ID_DIRECCION;
    }

    public void setID_DIRECCION(int ID_DIRECCION) {
        this.ID_DIRECCION = ID_DIRECCION;
    }
    
    
}
