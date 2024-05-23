package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    public List<Llamada> llamadas;
    private String nombre;
    private String numeroTelefono;

    public Cliente(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.llamadas = new ArrayList<>();
    }

    @Deprecated
    public Llamada registrarLlamada(Cliente destino, String tipo, int duracion) {
        switch (tipo) {
            case "nacional":
                return this.registrarLlamadaNacional(destino, duracion);
            case "internacional":
                return this.registrarLlamadaInternacional(destino, duracion);
            default:
                throw new IllegalArgumentException(tipo + " no es un tipo válido");
        }
    }

    private Llamada _registrarLlamada(Llamada llamada) {
        this.llamadas.add(llamada);
        return llamada;
    }

    public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
        return this._registrarLlamada(
                new LlamadaNacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion));
    }

    public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
        return this._registrarLlamada(
                new LlamadaInternacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion));
    }

    public double calcularMontoTotalLlamadas() {
        return this.llamadas.stream().mapToDouble(this::calcularMontoTotalLlamada).sum();
    }

    private double calcularMontoTotalLlamada(Llamada llamada) {
        return llamada.calcularMonto() * (1 - this.getDescuento());
    }

    protected abstract double getDescuento();

    //
    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    @Deprecated
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Deprecated
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
