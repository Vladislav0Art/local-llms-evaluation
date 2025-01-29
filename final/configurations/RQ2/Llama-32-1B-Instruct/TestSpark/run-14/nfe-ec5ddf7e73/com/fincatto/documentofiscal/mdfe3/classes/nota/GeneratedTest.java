package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testCodigoInterno() {
        String resultado = GeneratedTest.codigoInterno();
        assertEquals("123", resultado);
    }

    @Test
    public void testPlaca() {
        String resultado = GeneratedTest.placa();
        assertEquals("ABC", resultado);
    }

    @Test
    public void testRenavam() {
        String resultado = GeneratedTest.renavam();
        assertEquals("DEF", resultado);
    }

    @Test
    public void testTara() {
        int resultado = (int) GeneratedTest.tara();
        assertEquals(10, resultado);
    }

    @Test
    public void testCapacidadeKG() {
        double resultado = GeneratedTest.capacidadeKG();
        assertEquals(2.5, resultado, 0.01);
    }

    @Test
    public void testCapacidadeM3() {
        int resultado = (int) GeneratedTest.capacidadeM3();
        assertEquals(1, resultado);
    }

}