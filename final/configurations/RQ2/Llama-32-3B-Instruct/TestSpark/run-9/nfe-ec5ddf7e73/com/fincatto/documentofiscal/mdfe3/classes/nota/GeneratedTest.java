package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedTest {

    @Test
    public void setCodigoInternoValidoTest() {
        final String codigoInterno = "CODIGOINTERNO";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.isValido(codigoInterno));
    }

    @Test
    public void setCodigoInternoInvalidoTest() {
        final String codigoInterno = "CODIGOINTERNO";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertFalse(DFStringValidador.isValido(codigoInterno));
    }

    @Test
    public void setPlacaValidoTest() {
        final String placa = "PLACA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertTrue(DFStringValidador.isValido(placa));
    }

    @Test
    public void setPlacaInvalidoTest() {
        final String placa = "PLACA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertFalse(DFStringValidador.isValido(placa));
    }

    @Test
    public void getCapacidadeKGTest() {
        final String capacidadeKg = "CAPACIDADEKG";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKg);
        assertEquals(capacidadeKg, mfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3Test() {
        final String capacidadeM3 = "CAPACIDADEM3";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setTaraValidoTest() {
        final String tara = "TARA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertTrue(DFStringValidador.isValido(tara));
    }

    @Test
    public void setTaraInvalidoTest() {
        final String tara = "TARA";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertFalse(DFStringValidador.isValido(tara));
    }

}