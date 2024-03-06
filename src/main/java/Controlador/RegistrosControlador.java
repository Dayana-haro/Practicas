/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PersonaModelo;
import Modelo.RegistrosModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RegistrosControlador {

    private RegistrosModelo registros;
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
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

    public void IngresarRegistros(RegistrosModelo r) {
        try {
            String SQL = "{call sp_CrearRegistro(?, ?, ?, ?)}";
            CallableStatement rg = conectado.prepareCall(SQL);

            // Establecer los parámetros para el procedimiento almacenado
            rg.setString(1, r.getOBSERVACIONES());
            rg.setString(2, r.getVALORACION());
            rg.setString(3, r.getESTADO_PACIENTE());
            rg.setInt(4, r.getFK_NUMERO_TURNO());

            // Ejecutar el procedimiento almacenado
            rg.execute();

            JOptionPane.showMessageDialog(null, "Registro creado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear registro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void MostrarRegistros(RegistrosModelo re) {
        try {
            String SQL = "call sp_MostrarRegistro()";
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

    public void PersonaExistente(PersonaModelo persona) {
        String consulta = "SELECT * FROM persona WHERE TRIM(CI) = TRIM(?)";

        try (PreparedStatement preparedStatement = conectado.prepareStatement(consulta)) {
            preparedStatement.setString(1, String.valueOf(persona.getCI()).trim());
            ResultSet rs = preparedStatement.executeQuery();

            JOptionPane.showMessageDialog(null, "La persona ya está registrada.");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "La persona no está registrada." + ex);

        }
    }

    public void registrarPersona(PersonaModelo persona, RegistrosModelo registro) {
        String spCall = "{CALL sp_registrarPersonaRegistro(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try {
            CallableStatement callableStatement = conectado.prepareCall(spCall);
            callableStatement.setInt(1, persona.getCI());
            callableStatement.setString(2, persona.getNOMBRE());
            callableStatement.setString(3, persona.getAPELLIDO());
            callableStatement.setInt(4, persona.getEDAD());
            callableStatement.setString(5, persona.getGRUPO_PRIORITARIO());
            callableStatement.setInt(6, persona.getTELEFONO());
            callableStatement.setInt(7, persona.getCELULAR());
            callableStatement.setString(8, registro.getOBSERVACIONES());
            callableStatement.setString(9, registro.getVALORACION());
            callableStatement.setString(10, registro.getESTADO_PACIENTE());
            callableStatement.setInt(11, registro.getFK_NUMERO_TURNO());

            callableStatement.executeUpdate();

            JOptionPane.showInputDialog("Persona registrada correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(RegistrosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
