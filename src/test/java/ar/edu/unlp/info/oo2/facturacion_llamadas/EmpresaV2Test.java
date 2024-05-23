package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaV2Test {
    Empresa sistema;

    @BeforeEach
    public void setUp() {
        this.sistema = new Empresa();
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444554");
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444555");
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444556");
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444557");
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444558");
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444559");
    }

    @Test
    void testcalcularMontoTotalLlamadas() {
        Cliente emisorPersonaFisca = sistema.registrarClienteFisico("Brendan Eich", "11555666");
        Cliente remitentePersonaFisica = sistema.registrarClienteFisico("Doug Lea", "00000001");
        Cliente emisorPersonaJuridica = sistema.registrarClienteJuridico("Nvidia Corp", "17555222");
        Cliente remitentePersonaJuridica = sistema.registrarClienteJuridico("Sun Microsystems", "25765432");

        emisorPersonaJuridica.registrarLlamadaNacional(remitentePersonaFisica, 10);
        emisorPersonaJuridica.registrarLlamadaInternacional(remitentePersonaFisica, 8);
        emisorPersonaJuridica.registrarLlamadaNacional(remitentePersonaJuridica, 5);
        emisorPersonaJuridica.registrarLlamadaInternacional(remitentePersonaJuridica, 7);

        emisorPersonaFisca.registrarLlamadaNacional(remitentePersonaFisica, 15);
        emisorPersonaFisca.registrarLlamadaInternacional(remitentePersonaFisica, 45);
        emisorPersonaFisca.registrarLlamadaNacional(remitentePersonaJuridica, 13);
        emisorPersonaFisca.registrarLlamadaInternacional(remitentePersonaJuridica, 17);

        assertEquals(11454.64, emisorPersonaFisca.calcularMontoTotalLlamadas(), 0.01);
        assertEquals(2445.40, emisorPersonaJuridica.calcularMontoTotalLlamadas(), 0.01);
        assertEquals(0, remitentePersonaFisica.calcularMontoTotalLlamadas());
        assertEquals(0, remitentePersonaJuridica.calcularMontoTotalLlamadas());
    }

    @Test
    void testAgregarUsuario() {
        assertEquals(this.sistema.cantidadDeUsuarios(), 0);
        this.sistema.getGestorNumeros().agregarNumeroTelefono("2214444558");
        Cliente nuevaPersona = this.sistema.registrarClienteFisico("Alan Turing", "2444555");

        assertEquals(1, this.sistema.cantidadDeUsuarios());
        assertTrue(this.sistema.existeUsuario(nuevaPersona));
    }

    @Test
    void obtenerNumeroLibre() {
        // por defecto es el ultimo
        assertEquals("2214444559", this.sistema.getGestorNumeros().popNumeroLibre());

        this.sistema.getGestorNumeros().cambiarTipoGenerador(new GeneradorPrimeroStrategy());
        assertEquals("2214444554", this.sistema.getGestorNumeros().popNumeroLibre());

        this.sistema.getGestorNumeros().cambiarTipoGenerador(new GeneradorRandomStrategy());
        assertNotNull(this.sistema.getGestorNumeros().popNumeroLibre());
    }
}
