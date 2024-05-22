package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    protected double getCostoPorSegundo() {
        return 3;
    }

    @Override
    protected double getCostoAdicional() {
        return 0;
    }
}
