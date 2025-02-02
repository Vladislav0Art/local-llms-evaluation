package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_SimpleValidadorTest() {
        final String codigoInterno = "1234567890";
        final String esperado = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals(esperado, new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

    @Test
    public void setPlaca_PlaDeVeiculoValidadorTest() {
        final String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals(placa, new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

    @Test
    public void setRenavam_RenavamValidadorTest() {
        final String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals(renavam, new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

    @Test
    public void setTara_TaraValidadorTest() {
        final String tara = "12345";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("12345", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

    @Test
    public void setCapacidadeKG_CapacidadeValidadorTest() {
        final String capacidadeKG = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_CapacidadeValidadorTest() {
        final String capacidadeM3 = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

    @Test
    public void getCapacidadeKG_SimpleGetTest() {
        final String capacidadeKG = "10";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

    @Test
    public void setPlaca_PlaDeVeiculoGetTest() {
        final String placa = "ABC123";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca(placa);
        assertEquals(placa, reboque.getPlaca());
    }

    @Test
    public void setRenavam_RenavamGetTest() {
        final String renavam = "123456789";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam(renavam);
        assertEquals(renavam, reboque.getRenavam());
    }

    @Test
    public void setTara_TaraGetTest() {
        final String tara = "12345";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara(tara);
        assertEquals(tara, reboque.getTara());
    }

    @Test
    public void setCapacidadeM3_CapacidadeGetTest() {
        final String capacidadeM3 = "10";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, reboque.getCapacidadeM3());
    }

    @Test
    public void codigoInterno_SimpleNullTest() {
        final String codigoInterno = null;
        assert null != codigoInterno;
    }

    @Test
    public void placa_PlaDeVeiculoEmptyTest() {
        final String placa = "";
        assert false == DFStringValidador.placaDeVeiculo(placa, "Placa do reboque");
    }

    @Test
    public void renavam_RenavamInvalidIntervaloTest() {
        final String renavam = "1234567890";
        assert false == DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque");
    }

    @Test
    public void tara_TaraTooLongTest() {
        final String tara = "12345678901234567890";
        assert false == DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5);
    }

}