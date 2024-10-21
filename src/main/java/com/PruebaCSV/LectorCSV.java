package com.PruebaCSV;

import java.io.FileReader;
import com.opencsv.CSVReader;

/**
 *
 * @author RodrigoIbañez
 */

public class LectorCSV {

    public void leeCSV( String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo)); // Crea un objeto nuevo
            String[] fila = null; // Inicializar un array
            while((fila = csvReader.readNext()) != null) { // Comprueba si el fichero está vacio
                System.out.println(fila[0]    //
                        + " | "  + fila[1]    // Solo imprime las tres primeras lineas.
                        + " | "  + fila[2]);  //
            }
            csvReader.close(); // Cierra el CSV
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

    }

}
