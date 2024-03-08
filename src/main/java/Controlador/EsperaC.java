/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EsperaC {
    
   Conexion conectar =new Conexion();
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;
   
        
 public ArrayList<Object[]> obtenerListaEsperaDesdeSP() {
    ArrayList<Object[]> listaUsuario = new ArrayList<>();

    try {
        String spCall = "{CALL ObtenerListaEspera()}";
        CallableStatement cstmt = conectado.prepareCall(spCall);
        ResultSet res = cstmt.executeQuery();

        ResultSetMetaData metaData = res.getMetaData();
        int cont = 1;

        while (res.next()) {
            Object[] fila = new Object[9];
            for (int i = 1; i <9; i++) {
                fila[i] = res.getObject(i);
            }
            fila[0] = cont;

            listaUsuario.add(fila);
            cont++;
        }

        cstmt.close();
        return listaUsuario;

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }

    return null;
}

    
}
