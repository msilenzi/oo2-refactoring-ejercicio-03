package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
    public ClienteFisico(String nombre, String numeroTelefono, String dni) {
        super("fisica", nombre, numeroTelefono, null, dni);
    }

    @Override
    protected double aplicarDescuento(double monto) {
        return monto * (1 - Cliente.descuentoFis);
    }
}
