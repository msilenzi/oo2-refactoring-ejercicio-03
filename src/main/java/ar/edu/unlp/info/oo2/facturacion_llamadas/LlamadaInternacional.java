package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularMonto() {
        // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
        return this.getDuracion() * 150 * 1.21 + 50;
    }
}
