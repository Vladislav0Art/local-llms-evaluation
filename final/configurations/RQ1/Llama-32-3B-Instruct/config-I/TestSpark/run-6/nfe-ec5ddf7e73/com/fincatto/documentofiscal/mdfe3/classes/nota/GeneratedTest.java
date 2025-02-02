package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void codigoInternoSetValidoTest() {
        String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

    @Test
    public void codigoInternoSetInvalidoTest() {
        String codigoInterno = "abcdefghij";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

    @Test
    public void placaSetValidoTest() {
        String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

    @Test
    public void placaSetInvalidoTest() {
        String placa = "abcdefgh";
        DFStringValidador.placaDeVeiculo(placa, "Placa do reboque");
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

    @Test
    public void renavamSetValidoTest() {
        String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("123456789", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

    @Test
    public void renavamSetInvalidoTest() {
        String renavam = "abcdefghi";
        DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque");
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("123456789", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

    @Test
    public void taraSetValidoTest() {
        String tara = "10000";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

    @Test
    public void taraSetInvalidoTest() {
        String tara = "abcdefgh";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

    @Test
    public void capacidadeKGSetValidoTest() {
        String capacidadeKG = "1000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("1000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void capacidadeKGSetInvalidoTest() {
        String capacidadeKG = "abcdefgh";
        DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5);
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("1000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void capacidadeM3SetValidoTest() {
        String capacidadeM3 = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

    @Test
    public void capacidadeM3SetInvalidoTest() {
        String capacidadeM3 = "abcdefgh";
        DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2);
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}