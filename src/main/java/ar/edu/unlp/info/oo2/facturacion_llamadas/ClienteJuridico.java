package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
    public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
        super("juridica", nombre, numeroTelefono, cuit, null);
    }

    @Override
    protected double aplicarDescuento(double monto) {
        return monto * (1 - Cliente.descuentoJur);
    }
}
