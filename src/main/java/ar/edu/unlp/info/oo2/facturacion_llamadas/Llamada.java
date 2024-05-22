package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
    private String origen;
    private String destino;
    private int duracion;

    public static Llamada crearLlamada(String tipo, String origen, String destino, int duracion) {
        switch (tipo) {
            case "nacional":
                return new LlamadaNacional(origen, destino, duracion);
            case "internacional":
                return new LlamadaInternacional(origen, destino, duracion);
            default:
                throw new IllegalArgumentException(tipo + " no es un tipo válido");
        }
    }

    public Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public abstract double calcularMonto();

    //
    // Getters y setters

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
