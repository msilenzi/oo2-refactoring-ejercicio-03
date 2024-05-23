package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
    private SortedSet<String> lineas = new TreeSet<String>();
    private GeneradorStrategy tipoGenerador = new GeneradorUltimoStrategy();


    public SortedSet<String> getLineas() {
        return lineas;
    }

    public String obtenerNumeroLibre() {
        String linea = tipoGenerador.obtenerNumeroLibre(this.lineas);
        this.lineas.remove(linea);
        return linea;
    }

    @Deprecated
    public void cambiarTipoGenerador(String valor) {
        switch (valor) {
            case "ultimo":
                this.tipoGenerador = new GeneradorUltimoStrategy();
                break;
            case "primero":
                this.tipoGenerador = new GeneradorPrimeroStrategy();
                break;
            case "random":
                this.tipoGenerador = new GeneradorRandomStrategy();
                break;
        }
    }

    public void cambiarTipoGenerador(GeneradorStrategy tipoGenerador) {
        this.tipoGenerador = tipoGenerador;
    }
}
