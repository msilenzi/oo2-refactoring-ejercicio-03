package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
    private String dni;
    static double descuentoFis = 0;

    public ClienteFisico(String nombre, String numeroTelefono, String dni) {
        super(nombre, numeroTelefono);
        this.dni = dni;
    }

    @Override
    protected double aplicarDescuento(double monto) {
        return monto * (1 - descuentoFis);
    }

    public String getDni() {
        return this.dni;
    }

    @Deprecated
    public void setDni(String dni) {
        this.dni = dni;
    }
}
