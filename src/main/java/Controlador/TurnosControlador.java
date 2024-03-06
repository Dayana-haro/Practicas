/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TurnosModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TurnosControlador {
    private TurnosModelo turnos;
    Conexion conectar =new Conexion();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;
    public void IngresarTurnos(TurnosModelo t){
        try{      
            String SQL="call sp_InsertarTurno('"+t.getFECHA()+"',"
                    + "'"+t.getFK_CI()+"',"
                    + "'"+t.getHORA()+"')";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            resultado= ejecutar.executeQuery();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Registo creado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
           ejecutar.close(); 
        }catch(SQLException e){ 
    }
   }

    public void MostrarTurnos(){
         try{      
            String SQL="call sp_MostrarTurnos()";
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
