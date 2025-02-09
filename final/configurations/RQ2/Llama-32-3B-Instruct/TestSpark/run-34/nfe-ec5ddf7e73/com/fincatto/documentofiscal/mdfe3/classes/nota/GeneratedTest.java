package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTest {

    @Element(name = "CodigoInterno")
    private String codigoInterno;

    @Element(name = "Placa")
    private String placa;

    @Element(name = "Renavam")
    private String renavam;

    @Element(name = "Tara")
    private String tara;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        codigoInterno = "12345";
        placa = "ABC123";
        renavam = "1234567890";
        tara = "100kg";
    }

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInternoExpected = "12345";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInternoExpected, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaExpected = "ABC123";
        assertEquals(placaExpected, mdfInfoModalRodoviarioVeiculoReboque.setPlaca("ABC123"));
    }

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamExpected = "1234567890";
        assertEquals(renavamExpected, mdfInfoModalRodoviarioVeiculoReboque.setRenavam("1234567890"));
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraExpected = "100kg";
        assertEquals(taraExpected, mdfInfoModalRodoviarioVeiculoReboque.setTara("100kg"));
    }

    @Test
    public void testGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGMixedExpected = "100kg";
        assertEquals(capacidadeKGMixedExpected, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3Expected = "0";
        assertEquals(capacidadeM3Expected, mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("0"));
    }

    @Test
    public void testGetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3Expected = "0";
        assertEquals(capacidadeM3Expected, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}