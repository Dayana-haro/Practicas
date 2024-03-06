/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DirrecionModelo;
import Modelo.PersonaModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PersonaControlador {
    private PersonaModelo persona;
    Conexion conectar =new Conexion();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    //ResultSet resultado;
    int res;
    public void crearPersona(PersonaModelo p, DirrecionModelo d) {
    try {
        String SQL = "call sp_CrearPersona(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        CallableStatement callableStatement = conectado.prepareCall(SQL);
        callableStatement.setInt(1, p.getCI());
        callableStatement.setString(2, p.getNOMBRE());
        callableStatement.setString(3, p.getAPELLIDO());
        callableStatement.setInt(4, p.getEDAD());
        callableStatement.setString(5, p.getGRUPO_PRIORITARIO());
        callableStatement.setInt(6, p.getTELEFONO());
        callableStatement.setInt(7, p.getCELULAR());
        callableStatement.setString(8, d.getCALLE_PRINCIPAL());
        callableStatement.setString(9, d.getCALLE_SECUNDARIA());
        callableStatement.setString(10, d.getBARRIO());
        callableStatement.setString(11, d.getPUNTO_REFERENCIA());
        
        ResultSet resultSet = callableStatement.executeQuery();
        
        if (resultSet.next()) {
            int resultado = resultSet.getInt(1);
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona creada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se obtuvo resultado de la llamada al procedimiento almacenado");
        }
        
        callableStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
