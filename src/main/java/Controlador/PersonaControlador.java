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
            CallableStatement cp = conectado.prepareCall(SQL);
            
            // Establecer los parámetros para el procedimiento almacenado
            cp.setInt(1, p.getCI());
            cp.setString(2, p.getNOMBRE());
            cp.setString(3, p.getAPELLIDO());
            cp.setInt(4, p.getEDAD());
            cp.setString(5, p.getGRUPO_PRIORITARIO());
            cp.setString(6, p.getTELEFONO());
            cp.setString(7, p.getCELULAR());
            cp.setString(8, d.getCALLE_PRINCIPAL());
            cp.setString(9, d.getCALLE_SECUNDARIA());
            cp.setString(10, d.getBARRIO());
            cp.setString(11, d.getPUNTO_REFERENCIA());
            
            // Ejecutar el procedimiento almacenado
            cp.execute();
            
            JOptionPane.showMessageDialog(null, "INformación creada con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear persona: " + e.getMessage());
            e.printStackTrace();
        }
    }
   
  }
            
