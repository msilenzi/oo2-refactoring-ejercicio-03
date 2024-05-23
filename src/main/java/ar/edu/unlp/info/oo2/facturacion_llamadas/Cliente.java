package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public List<Llamada> llamadas;
    private String tipo;
    private String nombre;
    private String numeroTelefono;
    private String cuit;
    private String dni;

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    public Cliente(String tipo, String nombre, String numeroTelefono, String cuit, String dni) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.cuit = cuit;
        this.dni = dni;
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
        return aplicarDescuento(llamada.calcularMonto());
    }

    private double aplicarDescuento(double monto) {
        if (this.getTipo() == "fisica") {
            return monto * (1 - descuentoFis);
        } else if (this.getTipo() == "juridica") {
            return monto * (1 - descuentoJur);
        }
        return monto;
    }

    //
    // Getters y setters

    public String getTipo() {
        return tipo;
    }

    @Deprecated
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

    public String getCuit() {
        return cuit;
    }

    @Deprecated
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDNI() {
        return dni;
    }

    @Deprecated
    public void setDNI(String dni) {
        this.dni = dni;
    }
}
