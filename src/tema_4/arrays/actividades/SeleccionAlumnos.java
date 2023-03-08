package tema_4.arrays.actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SeleccionAlumnos {

    public static void main(String[] args) {

        // Definimos el array de alumnos
        String[] alumnos = {"Johnny", "Adrian", "Jossie", "Rodrigo", "Antonio", "JuanMa_Herr", "Daniel", "David", "Pablo", "Julian", "Victor", "JuanMaría", "JuanManuel_S", "Pepe", "John"};

        // Creamos una lista de alumnos y la llenamos con los elementos del array
        List<String> listaAlumnos = new ArrayList<String>();
        for (int i = 0; i < alumnos.length; i++) {
            listaAlumnos.add(alumnos[i]);
        }

        // Creamos un mapa para almacenar el número de veces que cada alumno ha sido seleccionado
        Map<String, Integer> contadores = new HashMap<String, Integer>();
        for (int i = 0; i < alumnos.length; i++) {
            contadores.put(alumnos[i], 0);
        }

        // Creamos un objeto Random para seleccionar al azar un alumno de la lista
        Random random = new Random();

        // Seleccionamos un alumno de la lista hasta que todos hayan sido seleccionados al menos una vez
        while (!listaAlumnos.isEmpty()) {
            // Obtenemos el índice de un alumno al azar
            int indice = random.nextInt(listaAlumnos.size());
            // Obtenemos el nombre del alumno seleccionado
            String alumno = listaAlumnos.get(indice);
            // Incrementamos el contador del alumno seleccionado
            contadores.put(alumno, contadores.get(alumno) + 1);
            // Eliminamos al alumno de la lista
            listaAlumnos.remove(indice);
        }
    }
}