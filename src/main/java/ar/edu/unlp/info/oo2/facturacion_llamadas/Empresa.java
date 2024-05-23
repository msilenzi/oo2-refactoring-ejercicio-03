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

    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        Cliente var = null;
        String tel = this.obtenerNumeroLibre();
        if (tipo.equals("fisica")) {
            var = new Cliente(nombre, tipo, tel, null, data);
        } else if (tipo.equals("juridica")) {
            var = new Cliente(nombre, tipo, tel, data, null);
        }
        clientes.add(var);
        return var;
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
