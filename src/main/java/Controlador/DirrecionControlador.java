/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DirrecionModelo;
import java.sql.CallableStatement;
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
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
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

    public void crearDirrecion(DirrecionModelo p) {
        try {
            String SQL = "{CALL sp_CrearDireccion(?, ?, ?, ?)}";
            CallableStatement dr = conectado.prepareCall(SQL);
            dr.setString(1, p.getCALLE_PRINCIPAL());
            dr.setString(2, p.getCALLE_SECUNDARIA());
            dr.setString(3, p.getBARRIO());
            dr.setString(4, p.getPUNTO_REFERENCIA());

            int resultado = dr.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Dirección ingresada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar la dirección", "Error", JOptionPane.ERROR_MESSAGE);
            }

            dr.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
