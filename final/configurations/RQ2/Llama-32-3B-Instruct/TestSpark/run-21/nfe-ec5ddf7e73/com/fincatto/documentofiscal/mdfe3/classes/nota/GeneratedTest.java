package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String codigoInterno = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mfinfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String placa = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mfinfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavam_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String renavam = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mfinfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void setTara_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String tara = "12345678902";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mfinfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void getCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String capacidadeKG = "1000";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "1000";
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String capacidadeM3 = "1000";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}