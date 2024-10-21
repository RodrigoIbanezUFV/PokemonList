package com.PruebaCSV;

public class PruebaCSV {
    /**
     * @author RodrigoIbañez
     */

    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();

        miLector.leeCSV("src/main/resources/datos/pokemon.csv");
    }
}
