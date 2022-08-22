package com.sucursales;

import java.util.ArrayList;

public class Fabrica {
    // Atributos:
    private ArrayList<Sucursal> sucursales;

    // Constructor
    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    // Métodos:
    public void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            sucursal.listarInstrumentos();
        }
    }

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
        System.out.println("Fue agregada la sucursal: " + s.getNombre());
        System.out.println("Detalles de la sucursal" + " " + s.getNombre() + ":");
        System.out.println(s);

    }

    public ArrayList<Instrumentos> instrumentosPorTipo(Tipo tipo) {
        ArrayList<Instrumentos> coincidencias = new ArrayList<>();
        for (int i = 0; i < sucursales.size(); i++) {
            coincidencias.addAll(sucursales.get(i).instrumentosPorTipo(tipo));
        }
        return coincidencias;

    }

    private int cantidadSucursales() {
        return sucursales.size();

    }

    public void porcInstrumentosPorTipo(String nombreSucursal) {
        // encontrar coincidencia de parametro sucursal:
        Sucursal s = null;
        int i = 0;
        while (i < cantidadSucursales() && !sucursales.get(i).getNombre().equalsIgnoreCase(nombreSucursal)) {
            i++;
        }
        if (i < cantidadSucursales()) {
            s = sucursales.get(i);
        }
        s.porcInstrumentosPorTipo(); // ? Aquí está llamando al método alojado en Sucursal

    }

}
