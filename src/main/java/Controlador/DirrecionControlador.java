/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DirrecionModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DirrecionControlador {
    private DirrecionModelo dirreccion;
    Conexion conectar =new Conexion();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;//leer y obtener datos

    public DirrecionControlador() {
    }

    public DirrecionControlador(DirrecionModelo dirreccion) {
        this.dirreccion = dirreccion;
    }

    public void setModelo(DirrecionModelo dirreccion) {
        this.dirreccion = dirreccion;
    }
    
    
    public void crearDirrecion (DirrecionModelo p){
        try{
                        
            String SQL="call sp_CrearDirrecion('"+p.getCALLE_PRINCIPAL()+"',"
                    + "'"+p.getCALLE_SECUNDARIA()+"',"
                    + "'"+p.getBARRIO()+"','"
                    +p.getPUNTO_REFERENCIA()+"')";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            resultado= ejecutar.executeQuery();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Dirreccion ingresada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
           ejecutar.close(); 
        }catch(SQLException e){
            
        }
    }
    
            
    private static class PreparateStament {

        public PreparateStament() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private ResultSet executeQuery() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
