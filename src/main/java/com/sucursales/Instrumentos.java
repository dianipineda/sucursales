package com.sucursales;

public class Instrumentos {
    // Atributos:
    private String id;
    private double precio;
    private Tipo tipo;

    // Constructores
    public Instrumentos(String id, double precio, Tipo tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;

    };

    // Métodos:

    @Override
    public String toString() {
        return "Instrumentos [id=" + id + ", precio=" + precio + ", tipo=" + tipo + "]";
    }

    public String getId() {
        return id;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
