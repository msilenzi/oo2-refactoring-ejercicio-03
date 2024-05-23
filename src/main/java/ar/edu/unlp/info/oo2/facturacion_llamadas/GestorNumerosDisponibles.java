package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
    private SortedSet<String> lineas = new TreeSet<String>();
    private String tipoGenerador = "ultimo";

    public SortedSet<String> getLineas() {
        return lineas;
    }

    public String obtenerNumeroLibre() {
        String linea;
        switch (tipoGenerador) {
            case "ultimo":
                linea = lineas.last();
                break;
            case "primero":
                linea = lineas.first();
                break;
            case "random":
                linea = new ArrayList<String>(lineas).get(new Random().nextInt(lineas.size()));
                break;
            default:
                return null;
        }
        this.lineas.remove(linea);
        return linea;
    }

    public void cambiarTipoGenerador(String valor) {
        this.tipoGenerador = valor;
    }
}
