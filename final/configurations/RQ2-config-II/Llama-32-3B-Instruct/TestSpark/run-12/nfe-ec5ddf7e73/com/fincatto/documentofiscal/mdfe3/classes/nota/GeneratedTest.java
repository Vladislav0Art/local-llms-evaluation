package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_DadoValorValido_EstabeleceCodigoInternoCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "00000001";
        modal.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modal.getCodigoInterno());
    }

    @Test
    public void setCodigoInterno_DadoValorInvalido_LanzaExcepoDeValidacao() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "ABC";
        try {
            modal.setCodigoInterno(codigoInterno);
            fail(" nao lancou excepo de validacao");
        } catch (Exception e) {
            // passa
        }
    }

    @Test
    public void setPlaca_DadoValorValido_EstabelecePlacaCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        modal.setPlaca(placa);
        assertEquals(placa, modal.getPlaca());
    }

    @Test
    public void setRenavam_DadoValorValido_EstabeleceRenavamCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "AB123456";
        modal.setRenavam(renavam);
        assertEquals(renavam, modal.getRenavam());
    }

    @Test
    public void setTara_DadoValorValido_EstabeleceTaraCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "kg";
        modal.setTara(tara);
        assertEquals(tara, modal.getTara());
    }

    @Test
    public void getCapacidadeKG_DadoValorValido_ReturnaCapacidadeKgCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_DadoValorValido_EstabeleceCapacidadeKgCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_DadoValorValido_ReturnaCapacidadeM3Corretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "10";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_DadoValorValido_EstabeleceCapacidadeM3Corretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "10";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

}