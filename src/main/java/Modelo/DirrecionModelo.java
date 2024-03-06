/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class DirrecionModelo {

    private int ID_DIRECCION;
    private String CALLE_PRINCIPAL;
    private String CALLE_SECUNDARIA;
    private String BARRIO;
    private String PUNTO_REFERENCIA;

    public DirrecionModelo() {
    }

    public DirrecionModelo(int ID_DIRECCION, String CALLE_PRINCIPAL, String CALLE_SECUNDARIA, String BARRIO, String PUNTO_REFERENCIA) {
        this.ID_DIRECCION = ID_DIRECCION;
        this.CALLE_PRINCIPAL = CALLE_PRINCIPAL;
        this.CALLE_SECUNDARIA = CALLE_SECUNDARIA;
        this.BARRIO = BARRIO;
        this.PUNTO_REFERENCIA = PUNTO_REFERENCIA;
    }

    public DirrecionModelo(String CALLE_PRINCIPAL, String CALLE_SECUNDARIA, String BARRIO, String PUNTO_REFERENCIA) {
        this.CALLE_PRINCIPAL = CALLE_PRINCIPAL;
        this.CALLE_SECUNDARIA = CALLE_SECUNDARIA;
        this.BARRIO = BARRIO;
        this.PUNTO_REFERENCIA = PUNTO_REFERENCIA;
    }
    
    

    public int getID_DIRECCION() {
        return ID_DIRECCION;
    }

    public void setID_DIRECCION(int ID_DIRECCION) {
        this.ID_DIRECCION = ID_DIRECCION;
    }

    public String getCALLE_PRINCIPAL() {
        return CALLE_PRINCIPAL;
    }

    public void setCALLE_PRINCIPAL(String CALLE_PRINCIPAL) {
        this.CALLE_PRINCIPAL = CALLE_PRINCIPAL;
    }

    public String getCALLE_SECUNDARIA() {
        return CALLE_SECUNDARIA;
    }

    public void setCALLE_SECUNDARIA(String CALLE_SECUNDARIA) {
        this.CALLE_SECUNDARIA = CALLE_SECUNDARIA;
    }

    public String getBARRIO() {
        return BARRIO;
    }

    public void setBARRIO(String BARRIO) {
        this.BARRIO = BARRIO;
    }

    public String getPUNTO_REFERENCIA() {
        return PUNTO_REFERENCIA;
    }

    public void setPUNTO_REFERENCIA(String PUNTO_REFERENCIA) {
        this.PUNTO_REFERENCIA = PUNTO_REFERENCIA;
    }
    
    
}
