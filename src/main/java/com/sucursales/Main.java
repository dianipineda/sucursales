package com.sucursales;

public class Main {
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        //
        Sucursal s1 = new Sucursal("norte");
        s1.agregarInstrumento(new Instrumentos("127", 6.3, Tipo.CUERDA));
        s1.agregarInstrumento(new Instrumentos("125", 7.5, Tipo.PERCUSION));
        s1.agregarInstrumento(new Instrumentos("125", 7.5, Tipo.VIENTO));
        s1.agregarInstrumento(new Instrumentos("125", 7.5, Tipo.PERCUSION));
        s1.agregarInstrumento(new Instrumentos("125", 7.5, Tipo.PERCUSION));
        Sucursal s2 = new Sucursal("sur");
        s2.agregarInstrumento(new Instrumentos("128", 10.3, Tipo.CUERDA));
        s2.agregarInstrumento(new Instrumentos("130", 11.5, Tipo.CUERDA));
        s2.agregarInstrumento(new Instrumentos("128", 9.5, Tipo.PERCUSION));
        s2.agregarInstrumento(new Instrumentos("130", 3.5, Tipo.VIENTO));
        s2.agregarInstrumento(new Instrumentos("130", 6.5, Tipo.VIENTO));

        //
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
        //
        System.out.println("______");
        System.out.println(s1.instrumentosPorTipo(Tipo.PERCUSION));
        System.out.println();
        System.out.println(f.instrumentosPorTipo(Tipo.PERCUSION));
        //

        // if (coincidencias.isEmpty()) {
        // System.out.println("No se encontraron coincidencias");
        // } else if (coincidencias.size() == 1) {
        // System.out.println("La coincidencia encontrada fue de: " + coincidencias);

        // } else {
        // System.out.println("Las coincidencias encontradas fueron las siguientes: " +
        // coincidencias);
        // }
        //
        // System.out.println();
        // s1.borrarInstrumento("125");
        // System.out.println();
        // s1.listarInstrumentos();
        // System.out.println();
        // f.listarInstrumentos();

    }

}
