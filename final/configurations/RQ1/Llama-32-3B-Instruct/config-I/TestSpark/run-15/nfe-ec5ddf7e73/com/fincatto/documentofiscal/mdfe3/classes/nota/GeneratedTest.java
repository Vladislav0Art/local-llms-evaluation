package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void testCodigoInternoValidado() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(obj.getCodigoInterno().length() == 10 && !obj.getCodigoInterno().isEmpty());
    }

    @Test
    public void testCodigoInternoInvalido() {
        String codigoInterno = "1234567";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertFalse(obj.getCodigoInterno().length() == 10 && !obj.getCodigoInterno().isEmpty());
    }

    @Test
    public void testPlacaValidada() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(obj.getPlaca().length() == 7 && !obj.getPlaca().isEmpty());
    }

    @Test
    public void testRenavamValidada() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(obj.getRenavam().length() == 9 && !obj.getRenavam().isEmpty());
    }

    @Test
    public void testPlacaInvalida() {
        String placa = "ABC";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertFalse(obj.getPlaca().length() == 7 && !obj.getPlaca().isEmpty());
    }

    @Test
    public void testRenavamInvalida() {
        String renavam = "1234567";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertFalse(obj.getRenavam().length() == 9 && !obj.getRenavam().isEmpty());
    }

    @Test
    public void testTaraValidada() {
        String tara = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara().length() == 5 && !obj.getTara().isEmpty());
    }

    @Test
    public void testTaraInvalida() {
        String tara = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertFalse(obj.getTara().length() == 5 && !obj.getTara().isEmpty());
    }

    @Test
    public void testCapacidadeKGValidada() {
        String capacidadeKG = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertTrue(obj.getCapacidadeKG().length() == 3 && !obj.getCapacidadeKG().isEmpty());
    }

    @Test
    public void testCapacidadeKGInvalida() {
        String capacidadeKG = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertFalse(obj.getCapacidadeKG().length() == 3 && !obj.getCapacidadeKG().isEmpty());
    }

    @Test
    public void testCapacidadeM3Validada() {
        String capacidadeM3 = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(obj.getCapacidadeM3().length() == 2 && !obj.getCapacidadeM3().isEmpty());
    }

    @Test
    public void testCapacidadeM3Invalida() {
        String capacidadeM3 = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertFalse(obj.getCapacidadeM3().length() == 2 && !obj.getCapacidadeM3().isEmpty());
    }

}