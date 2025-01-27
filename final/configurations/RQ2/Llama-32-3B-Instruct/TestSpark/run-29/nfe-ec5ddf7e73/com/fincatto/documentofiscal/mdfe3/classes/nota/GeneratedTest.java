package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_ValidadorSatisfechaCodigoInterno_Ok() {
        String codigoInterno = "123456";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(codigoInterno));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(obj.getCodigoInterno());
    }

    @Test
    public void setPlaca_ValidadorSatisfechaPlaca_Ok() {
        String placa = "ABC123";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(placa));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(obj.getPlaca());
    }

    @Test
    public void setRenavam_ValidadorSatisfechaRenavam_Ok() {
        String renavam = "1234567890";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(renavam));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(obj.getRenavam());
    }

    @Test
    public void setTara_ValidadorSatisfechaTara_Ok() {
        String tara = "100kg";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(tara));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara());
    }

    @Test
    public void getCapacidadeKG_SinValorDevuelvenull() {
        assertEquals(null, new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_InsercionDeValorCorrecto() {
        String capacidade = "500kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidade);
        assertEquals(capacidade, obj.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_SinValorDevuelvenull() {
        assertEquals(null, new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_InsercionDeValorCorrecto() {
        String capacidade = "200m3";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidade);
        assertEquals(capacidade, obj.getCapacidadeM3());
    }

}