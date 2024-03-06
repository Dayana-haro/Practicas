/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TurnosModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TurnosControlador {

    private TurnosModelo turnos;
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;

    public void IngresarTurnos(TurnosModelo t) {
        try {
            String SQL = "call sp_InsertarTurno('" + t.getFECHA() + "',"
                    + "'" + t.getFK_CI() + "',"
                    + "'" + t.getHORA() + "')";
            ejecutar = (PreparateStament) conectado.prepareCall(SQL);
            resultado = ejecutar.executeQuery();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registo creado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }
            ejecutar.close();
        } catch (SQLException e) {
        }
    }

    public void MostrarTurnos() {
        try {
            String SQL = "call sp_MostrarTurnos()";
            ejecutar = (PreparateStament) conectado.prepareCall(SQL);
            resultado = ejecutar.executeQuery();
            if (res > 0) {
                //JOptionPane.showMessageDialog(null, "Persona creada con exito");
            } else {
                //JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }
            ejecutar.close();
        } catch (SQLException e) {

        }
    }
    // Método que llama al procedimiento almacenado obtener_fecha y devuelve una fecha

    public Date obtenerFecha(int dia) {
        Date fecha = null; // variable para almacenar la fecha
        try {
            // Crear el CallableStatement con la sentencia CALL
            String sql = "{CALL obtener_fecha(?)}";
            CallableStatement cs = conectado.prepareCall(sql); // conectado es la conexión que ya tienes
            // Asignar el valor al parámetro de entrada
            cs.setInt(1, dia); // dia es el parámetro que recibe el método
            // Registrar el parámetro de salida
            cs.registerOutParameter(2, Types.DATE);
            // Ejecutar el CallableStatement
            cs.execute();
            // Obtener el valor del parámetro de salida
            fecha = cs.getDate(2); // asignamos el valor a la variable fecha
            // Cerrar el CallableStatement
            cs.close();
        } catch (SQLException e) {
            // Manejar la excepción
            e.printStackTrace();
        }
        return fecha; // devolvemos la fecha
    }

}
