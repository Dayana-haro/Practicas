import Controlador.TurnosControlador;
import java.util.List;

public class Pruebas {

    public static void main(String[] args) {
        // Crear una instancia del controlador de turnos
        TurnosControlador turnosControlador = new TurnosControlador();

        // Mostrar los turnos recuperados
        List<String[]> turnosRecuperados = turnosControlador.recuperarTurnos();

        System.out.println("Datos recuperados:");
        for (String[] turno : turnosRecuperados) {
            // Los índices en el arreglo corresponden a valoracion, fecha y hora, respectivamente
            String valoracion = turno[0];
            String fecha = turno[1];
            String hora = turno[2];

            // Imprimir los datos del turno
            System.out.println("Valoración: " + valoracion + ", Fecha: " + fecha + ", Hora: " + hora);
        }
    }
}
