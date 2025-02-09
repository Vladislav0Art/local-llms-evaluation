package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_ValidadorDeString_ReturnsCorrectValue {

    @Element(name = "codigoInterno")
    private String codigoInterno;

    @Element(name = "placa")
    private String placa;

    @Element(name = "renavam")
    private String renavam;

    @Element(name = "tara")
    private String tara;

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

    @Test
    public void setCapacidadeKG_ValidadorDeString_ReturnsCorrectValue() {
        dfStringValidador.setCapacidadeKG("123456789");
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(codigoInterno);
        assertEquals(dfStringValidador.getCapacidadeKG(), codigoInterno);
    }

}