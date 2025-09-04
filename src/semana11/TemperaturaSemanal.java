package semana11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// Declaro una clase pública llamada TemperaturaSemanal
public class TemperaturaSemanal {

    // Defino el método principal, donde comienza la ejecución del programa
    public static void main(String[] args) {

        // Especifico que voy a trabajar con 2 ciudades
        int ciudades = 2;

        // Indico que cada semana tiene 7 días
        int diasSemana = 7;

        // Trabajo con datos de 2 semanas
        int semanas = 2;

        // Creo una matriz tridimensional para almacenar las temperaturas
       
        double[][][] temperaturas = {
            {   // Datos para la Ciudad 1
                {22.5, 23.0}, // Temperaturas del lunes en semana 1 y 2
                {24.0, 22.8}, // Martes
                {23.5, 24.1}, // Miércoles
                {25.0, 23.7}, // Jueves
                {24.8, 24.5}, // Viernes
                {23.9, 25.0}, // Sábado
                {22.7, 24.3}  // Domingo
            },
            {   // Datos para la Ciudad 2
                {18.2, 19.0}, // Lunes
                {19.5, 18.7}, // Martes
                {20.0, 19.8}, // Miércoles
                {21.3, 20.5}, // Jueves
                {20.8, 21.0}, // Viernes
                {19.9, 20.2}, // Sábado
                {18.7, 19.5}  // Domingo
            }
        };

        // Inicio un ciclo para recorrer cada ciudad
        for (int c = 0; c < ciudades; c++) {

            // Imprimo el encabezado para la ciudad actual
            System.out.println("Ciudad " + (c + 1) + ":");

            // Recorro cada semana
            for (int s = 0; s < semanas; s++) {

                // Inicializo la variable suma para acumular las temperaturas
                double suma = 0;

                // Recorro cada día de la semana
                for (int d = 0; d < diasSemana; d++) {

                    // Acumulo la temperatura correspondiente a la ciudad, día y semana
                    suma += temperaturas[c][d][s];
                }

                // Calculo el promedio dividiendo la suma entre los 7 días
                double promedio = suma / diasSemana;

                // Imprimo el promedio con dos decimales, indicando la semana
                System.out.printf("  Semana %d: Promedio = %.2f°C%n", s + 1, promedio);
            }
        }
    }
}  //Final