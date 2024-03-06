/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistrosModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RegistrosControlador {
     private RegistrosModelo registros;
    Conexion conectar =new Conexion();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;

    public RegistrosControlador() {
    }

    public RegistrosControlador(RegistrosModelo registros) {
        this.registros = registros;
    }

    public RegistrosModelo getRegistros() {
        return registros;
    }

    public void setRegistros(RegistrosModelo registros) {
        this.registros = registros;
    }
    
    
    public void IngresarRegistros(RegistrosModelo r){
    String Estado="Pendiente";
    try{      
        String SQL="call sp_CrearRegistro(?, ?, ?, ?)";
        CallableStatement callableStatement = conectado.prepareCall(SQL);
        callableStatement.setString(1, r.getOBSERVACIONES());
        callableStatement.setString(2, r.getVALORACION());
        callableStatement.setString(3, r.getESTADO_PACIENTE());
        callableStatement.setString(4, Estado);
        
        ResultSet resultSet = callableStatement.executeQuery();
        
        if (resultSet.next()) {
            int resultado = resultSet.getInt(1);
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro creado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se obtuvo resultado de la llamada al procedimiento almacenado");
        }
        
        callableStatement.close(); 
    } catch(SQLException e){
        e.printStackTrace();
    }
}

    public void MostrarRegistros(RegistrosModelo re){
        try{      
            String SQL="call sp_MostrarRegistro()";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            resultado= ejecutar.executeQuery();
            if(res>0){
                //JOptionPane.showMessageDialog(null, "Persona creada con exito");
            }else{
                //JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
           ejecutar.close(); 
        }catch(SQLException e){
            
        }
    }
    
}
