package com.sucursales;

import java.util.ArrayList;

public class Sucursal {
    // Atributos:
    private String nombre;
    private ArrayList<Instrumentos> instrumentos;

    // Constructores:
    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>(); // el constructor es quien debe inicializar a la colección, no el Main
    }

    // Métodos:
    public void agregarInstrumento(Instrumentos ins) {
        instrumentos.add(ins);

    }

    public void listarInstrumentos() {
        System.out.println("Los instrumentos en la lista son los siguientes: ");
        for (Instrumentos i : instrumentos) {
            System.out.println(i);
        }

    }

    public ArrayList<Instrumentos> instrumentosPorTipo(Tipo tipo) {
        ArrayList<Instrumentos> coincidencias = new ArrayList<>();

        for (int i = 0; i < instrumentos.size(); i++) {
            if (tipo == instrumentos.get(i).getTipo()) {
                coincidencias.add((instrumentos.get(i)));
            }
        }
        return coincidencias;

    }

    public void borrarInstrumento(String id) {
        for (int i = instrumentos.size() - 1; i > 0; i--) {
            if (instrumentos.get(i).getId().equals(id)) {
                instrumentos.remove(i);
            }
        }
    }

    public void porcInstrumentosPorTipo() {
        // calculo de contadores de cada tipo y total de tipos:
        double countPercusion = 0;
        double countViento = 0;
        double countCuerda = 0;
        double total = 0;
        String p = Tipo.PERCUSION.toString();
        String v = Tipo.VIENTO.toString();
        String c = Tipo.CUERDA.toString();

        for (Instrumentos i : instrumentos) {
            if ((i.getTipo().toString().equals(p))) {
                countPercusion += 1;
            } else if (i.getTipo().toString().equals(v)) {
                countViento += 1;

            } else if (i.getTipo().toString().equals(c)) {
                countCuerda += 1;
            }

        }

        total = countPercusion + countViento + countCuerda;
        // calculo de porcentajes por tipo:
        double porcPercusion = (countPercusion / total) * 100;
        double porcViento = (countViento / total) * 100;
        double porcCuerda = (countCuerda / total) * 100;

        System.out.println("El porcentaje de instrumentos de Percusion es de: " + porcPercusion + "%");
        System.out.println("El porcentaje de instrumentos de Viento es de: " + porcViento + "%");
        System.out.println("El porcentaje de instrumentos de Cuerda es de: " + porcCuerda + "%");

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Sucursal [instrumentos=" + instrumentos + ", nombre=" + nombre + "]";
    }

}
