/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class TurnosModelo {

    private int NUMERO_TURNO;
    private String FECHA;
    private String FK_CI;
    private String HORA;

    public TurnosModelo(int NUMERO_TURNO, String FECHA, String FK_CI, String HORA) {
        this.NUMERO_TURNO = NUMERO_TURNO;
        this.FECHA = FECHA;
        this.FK_CI = FK_CI;
        this.HORA = HORA;
    }

    public TurnosModelo(String FECHA, String HORA) {
        this.FECHA = FECHA;
        this.HORA = HORA;
    }
    

    public TurnosModelo() {
    }

    public int getNUMERO_TURNO() {
        return NUMERO_TURNO;
    }

    public void setNUMERO_TURNO(int NUMERO_TURNO) {
        this.NUMERO_TURNO = NUMERO_TURNO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getFK_CI() {
        return FK_CI;
    }

    public void setFK_CI(String FK_CI) {
        this.FK_CI = FK_CI;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }

}
