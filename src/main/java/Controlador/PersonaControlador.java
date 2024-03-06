/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DirrecionModelo;
import Modelo.PersonaModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
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
    ResultSet resultado;
    int res;
    
    
   public void crearPersona(PersonaModelo p, DirrecionModelo d) {
        try {
            String SQL = "{call sp_CrearPersona(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement statement = conectado.prepareCall(SQL);
            
            // Establecer los parámetros para el procedimiento almacenado
            statement.setInt(1, p.getCI());
            statement.setString(2, p.getNOMBRE());
            statement.setString(3, p.getAPELLIDO());
            statement.setInt(4, p.getEDAD());
            statement.setString(5, p.getGRUPO_PRIORITARIO());
            statement.setString(6, Integer.toString(p.getTELEFONO()));
            statement.setString(7, Integer.toString(p.getCELULAR()));
            statement.setString(8, d.getCALLE_PRINCIPAL());
            statement.setString(9, d.getCALLE_SECUNDARIA());
            statement.setString(10, d.getBARRIO());
            statement.setString(11, d.getPUNTO_REFERENCIA());
            
            // Ejecutar el procedimiento almacenado
            statement.execute();
            
            JOptionPane.showMessageDialog(null, "INformación creada con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear persona: " + e.getMessage());
            e.printStackTrace();
        }
    }
   
  }
            
