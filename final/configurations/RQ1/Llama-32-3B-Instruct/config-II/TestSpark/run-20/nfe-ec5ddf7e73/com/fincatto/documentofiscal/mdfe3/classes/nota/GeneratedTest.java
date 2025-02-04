package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedTest {

    @Test
    public void codigoInternoSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorZero() {
        final String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

    @Test
    public void codigoInternoSet__InvalidadoDevidoALaPropriaInicializacao__NulaNorZero() {
        final String codigoInterno = "00000000000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertNull(new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

    @Test
    public void placaSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

    @Test
    public void renavamSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String renavam = "111234";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("111234", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

    @Test
    public void taraSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String tara = "00000";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("00000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

    @Test
    public void capacidadeKGSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String capacidadeKG = "5000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void capacidadeM3Set__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String capacidadeM3 = "100";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("100", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

    @Test
    public void capacidadeKGGet__RetornaValorDeCapacidade() {
        final String capacidadeKG = "5000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void capacidadeM3Get__RetornaValorDeCapacidade() {
        final String capacidadeM3 = "100";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("100", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

    @Test
    public void capacidadeKGSet__ValidadoPorValidadorDeCapacidadeNDigitos() {
        final String capacidadeKG = "123456789012";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

    @Test
    public void capacidadeM3Set__ValidadoPorValidadorDeCapacidadeNDigitos() {
        final String capacidadeM3 = "12345678901234";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("100", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}