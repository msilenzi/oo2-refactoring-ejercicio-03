package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularMonto() {
        // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
        return this.getDuracion() * 3 * 1.21;
    }
}
