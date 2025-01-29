package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testCodigoInterno() {
        String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, notar.getCodigoInterno());
    }

    @Test
    public void testPlaca() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setPlaca(placa);
        assertEquals(placa, notar.getPlaca());
    }

    @Test
    public void testRenavam() {
        String renavam = "DEF456";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setRenavam(renavam);
        assertEquals(renavam, notar.getRenavam());
    }

    @Test
    public void testTara() {
        String tara = "GHI789";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setTara(tara);
        assertEquals(tara, notar.getTara());
    }

    @Test
    public void testCapacidadeKG() {
        String capacidadeKG = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, notar.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() {
        String capacidadeKG = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, notar.getCapacidadeKG());
    }

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, notar.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3() {
        String capacidadeM3 = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, notar.getCapacidadeM3());
    }

}