package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "1234567890";
        DfStringValidador dfStringValidador = new DfStringValidador();
        assertEquals(codigoInterno, MDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void test_setPlaca() {
        String placa = "placa";
        DfMethodValidador dfMethodValidador = new DfMethodValidador();
        assertEquals(placa, MDFInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void test_SetRenavam() {
        String renavam = "renavam";
        DfStringValidador dfStringValidador = new DfStringValidador();
        assertEquals(renavam, MDFInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void test_SetKg() {
        String kg = "kg";
        DfMethodValidador dfMethodValidador = new DfMethodValidador();
        assertEquals(kg, MDFInfoModalRodoviarioVeiculoReboque getKg());
    }

    @Test
    public void test_SetPeso() {
        String peso = "kg";
        DfMethodValidador dfMethodValidador = new DfMethodValidador();
        assertEquals(peso, MDFInfoModalRodoviarioVeiculoReboque getPeso());
    }

}