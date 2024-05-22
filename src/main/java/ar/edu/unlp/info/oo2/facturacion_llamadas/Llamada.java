package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
    private String tipoDeLlamada;
    private String origen;
    private String destino;
    private int duracion;

    public Llamada(String tipoLlamada, String origen, String destino, int duracion) {
        this.tipoDeLlamada = tipoLlamada;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public double calcularMonto() {
        if (this.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return this.getDuracion() * 3 * 1.21;
        }
        if (this.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return this.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
    }

    //
    // Getters y setters

    public String getTipoDeLlamada() {
        return tipoDeLlamada;
    }

    public String getRemitente() {
        return destino;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getOrigen() {
        return origen;
    }
}
