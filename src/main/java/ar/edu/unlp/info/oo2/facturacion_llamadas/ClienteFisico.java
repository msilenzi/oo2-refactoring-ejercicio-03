package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
    private String dni;

    public ClienteFisico(String nombre, String numeroTelefono, String dni) {
        super(nombre, numeroTelefono);
        this.dni = dni;
    }

    @Override
    protected double getDescuento() {
        return 0;
    }

    public String getDni() {
        return this.dni;
    }

    @Deprecated
    public void setDni(String dni) {
        this.dni = dni;
    }
}
