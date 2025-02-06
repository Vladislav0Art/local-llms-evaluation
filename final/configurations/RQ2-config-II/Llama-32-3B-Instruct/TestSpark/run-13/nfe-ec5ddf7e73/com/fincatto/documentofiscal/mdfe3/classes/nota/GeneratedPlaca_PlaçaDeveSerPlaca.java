package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedPlaca_PlaçaDeveSerPlaca {

    @Element(name = "codigoInterno")
    private String codigoInterno;

    @Element(name = "placa")
    private String placa;

    @Element(name = "renavam")
    private String renavam;

    @Element(name = "tara")
    private String tara;

    @Element(name = "capacidadeKG")
    private String capacidadeKG;

    public void setCodigoInterno(final String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setPlaca(final String placa) {
        this.placa = placa;
    }

    public void setRenavam(final String renavam) {
        this.renavam = renavam;
    }

    public void setTara(final String tara) {
        this.tara = tara;
    }

    public void setCapacidadeKG(final String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    @Test
    public void placa_PlaçaDeveSerPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("placa");
        assertEquals("placa", obj.getPlaca());
    }

}