package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
    private SortedSet<String> lineas = new TreeSet<String>();
    private GeneradorStrategy generador = new GeneradorUltimoStrategy();


    public SortedSet<String> getLineas() {
        return lineas;
    }

    public boolean agregarNumeroTelefono(String str) {
        return this.lineas.add(str);
    }

    public String popNumeroLibre() {
        String linea = generador.obtenerNumeroLibre(this.lineas);
        this.lineas.remove(linea);
        return linea;
    }

    @Deprecated
    public void cambiarTipoGenerador(String valor) {
        switch (valor) {
            case "ultimo":
                this.generador = new GeneradorUltimoStrategy();
                break;
            case "primero":
                this.generador = new GeneradorPrimeroStrategy();
                break;
            case "random":
                this.generador = new GeneradorRandomStrategy();
                break;
        }
    }

    public void cambiarTipoGenerador(GeneradorStrategy generador) {
        this.generador = generador;
    }
}
