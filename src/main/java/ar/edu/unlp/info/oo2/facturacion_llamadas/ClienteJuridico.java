package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente {
    private String cuit;

    public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
        super(nombre, numeroTelefono);
        this.cuit = cuit;
    }

    @Override
    protected double getDescuento() {
        return 0.15;
    }

    public String getCuit() {
        return this.cuit;
    }

    @Deprecated
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
