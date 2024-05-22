package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public List<Llamada> llamadas = new ArrayList<Llamada>();
    private String tipo;
    private String nombre;
    private String numeroTelefono;
    private String cuit;
    private String dni;

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    public Llamada registrarLlamada(Cliente destino, String tipo, int duracion) {
        Llamada llamada = new Llamada(tipo, this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
        this.llamadas.add(llamada);
        return llamada;
    }

    public double calcularMontoTotalLlamadas() {
        return this.llamadas.stream().mapToDouble(this::calcularMontoTotalLlamada).sum();
    }

    private double calcularMontoTotalLlamada(Llamada l) {
        return aplicarDescuento(calcularMontoLlamada(l));
    }

    private double calcularMontoLlamada(Llamada l) {
        if (l.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return l.getDuracion() * 3 * 1.21;
        } else if (l.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return l.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }
}
