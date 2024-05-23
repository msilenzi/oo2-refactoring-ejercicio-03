package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    public boolean agregarNumeroTelefono(String str) {
        boolean encontre = guia.getLineas().contains(str);
        if (!encontre) {
            guia.getLineas().add(str);
            encontre = true;
            return encontre;
        } else {
            encontre = false;
            return encontre;
        }
    }

    public String obtenerNumeroLibre() {
        return guia.obtenerNumeroLibre();
    }

    @Deprecated
    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        switch (tipo) {
            case "fisica":
                return this.registrarClienteFisico(nombre, data);
            case "juridica":
                return this.registrarClienteJuridico(nombre, data);
            default:
                throw new IllegalArgumentException(tipo + " no es un tipo válido");
        }
    }

    private Cliente _registrarUsuario(Cliente cliente) {
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente registrarClienteFisico(String nombre, String dni) {
        return this._registrarUsuario(new ClienteFisico(nombre, this.obtenerNumeroLibre(), dni));
    }

    public Cliente registrarClienteJuridico(String nombre, String cuit) {
        return this._registrarUsuario(new ClienteJuridico(nombre, this.obtenerNumeroLibre(), cuit));
    }

    @Deprecated
    public Llamada registrarLlamada(Cliente origen, Cliente destino, String tipo, int duracion) {
        return origen.registrarLlamada(destino, tipo, duracion);
    }

    @Deprecated
    public double calcularMontoTotalLlamadas(Cliente cliente) {
        return cliente.calcularMontoTotalLlamadas();
    }

    public int cantidadDeUsuarios() {
        return clientes.size();
    }

    public boolean existeUsuario(Cliente persona) {
        return clientes.contains(persona);
    }

    public GestorNumerosDisponibles getGestorNumeros() {
        return this.guia;
    }
}
