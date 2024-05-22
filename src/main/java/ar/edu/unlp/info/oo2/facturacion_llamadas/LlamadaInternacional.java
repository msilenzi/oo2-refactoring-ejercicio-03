package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    protected double getCostoPorSegundo() {
        return 150;
    }

    @Override
    protected double getCostoAdicional() {
        return 50;
    }
}
