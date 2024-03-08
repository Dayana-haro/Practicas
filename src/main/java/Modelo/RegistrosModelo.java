/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class RegistrosModelo {

    private int ID_REGISTRO;
    private String OBSERVACIONES;
    private String VALORACION;
    private String ESTADO_PACIENTE;
    private int FK_NUMERO_TURNO;

    public RegistrosModelo() {
    }

    public RegistrosModelo(int ID_REGISTRO, String OBSERVACIONES, String VALORACION, String ESTADO_PACIENTE, int FK_NUMERO_TURNO) {
        this.ID_REGISTRO = ID_REGISTRO;
        this.OBSERVACIONES = OBSERVACIONES;
        this.VALORACION = VALORACION;
        this.ESTADO_PACIENTE = ESTADO_PACIENTE;
        this.FK_NUMERO_TURNO = FK_NUMERO_TURNO;
    }

    public RegistrosModelo(int ID_REGISTRO, String OBSERVACIONES, String VALORACION, String ESTADO_PACIENTE) {
        this.ID_REGISTRO = ID_REGISTRO;
        this.OBSERVACIONES = OBSERVACIONES;
        this.VALORACION = VALORACION;
        this.ESTADO_PACIENTE = ESTADO_PACIENTE;
    }

    public RegistrosModelo(String VALORACION) {
        this.VALORACION = VALORACION;
    }
    
    
    
    

    public int getID_REGISTRO() {
        return ID_REGISTRO;
    }

    public void setID_REGISTRO(int ID_REGISTRO) {
        this.ID_REGISTRO = ID_REGISTRO;
    }

    public String getOBSERVACIONES() {
        return OBSERVACIONES;
    }

    public void setOBSERVACIONES(String OBSERVACIONES) {
        this.OBSERVACIONES = OBSERVACIONES;
    }

    public String getVALORACION() {
        return VALORACION;
    }

    public void setVALORACION(String VALORACION) {
        this.VALORACION = VALORACION;
    }

    public String getESTADO_PACIENTE() {
        return ESTADO_PACIENTE;
    }

    public void setESTADO_PACIENTE(String ESTADO_PACIENTE) {
        this.ESTADO_PACIENTE = ESTADO_PACIENTE;
    }

    public int getFK_NUMERO_TURNO() {
        return FK_NUMERO_TURNO;
    }

    public void setFK_NUMERO_TURNO(int FK_NUMERO_TURNO) {
        this.FK_NUMERO_TURNO = FK_NUMERO_TURNO;
    }
    
    
}
