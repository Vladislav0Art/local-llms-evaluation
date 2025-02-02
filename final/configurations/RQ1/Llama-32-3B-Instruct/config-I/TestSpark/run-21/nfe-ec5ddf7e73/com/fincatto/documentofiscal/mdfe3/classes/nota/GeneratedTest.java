package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetAndSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        modal.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modal.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "123456";
        modal.setPlaca(placa);
        assertEquals(placa, modal.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        modal.setRenavam(renavam);
        assertEquals(renavam, modal.getRenavam());
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        modal.setTara(tara);
        assertEquals(tara, modal.getTara());
    }

    @Test
    public void testSetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "12";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "12";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

    @Test
    public void testGetCapacidadeKG_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals("", modal.getCapacidadeKG());
    }

    @Test
    public void testGetTara_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "";
        modal.setTara(tara);
        assertEquals("", modal.getTara());
    }

    @Test
    public void testGetCapacidadeM3_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals("", modal.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeKG_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = null;
        try {
            modal.setCapacidadeKG(capacidadeKG);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    public void testSetTara_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = null;
        try {
            modal.setTara(tara);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    public void testSetCapacidadeM3_Null() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = null;
        try {
            modal.setCapacidadeM3(capacidadeM3);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    public void testGetPlaca_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "";
        modal.setPlaca(placa);
        assertEquals("", modal.getPlaca());
    }

}