package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "ABC123";
        when(object.setCodigoInterno(null)).thenReturn(true);
        object.setCodigoInterno(codigoInterno);

        when(codigoInterno.trim()).thenReturn("trimmed_codigo_interno");
        assertEquals("trimmed_codigo_interno", object.getCodigoInterno());
    }

    @Test
    public void test_setPlaca() {
        String placa = "XYZ456";
        element = Element.builder().name("placa").text(placa).build();
        when(object.setPlaca(element)).thenReturn(true);
        object.setPlaca(placa);

        assertEquals(placa, object.getPlaca());
    }

    @Test
    public void test_setRenavam() {
        String renavam = "GHI789";
        element = Element.builder().name("renavam").text(renavam).build();
        when(object.setRenavam(element)).thenReturn(true);
        object.setRenavam(renavam);

        assertEquals(renavam, object.getRenavam());
    }

    @Test
    public void test_setTara() {
        String tara = "JKL012";
        element = Element.builder().name("tara").text(tara).build();
        when(object.setTara(element)).thenReturn(true);
        object.setTara(tara);

        assertEquals(tara, object.getTara());
    }

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "MGT456";
        element = Element.builder().name("capacidade_kg").text(capacidadeKG).build();
        when(object.getCapacidadeKG(element)).thenReturn(true);
        object.setCapacidadeKG(capacidadeKG);

        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "MGT456";
        element = Element.builder().name("capacidade_kg").text(capacidadeKG).build();
        when(object.setCapacidadeKG(element)).thenReturn(true);
        object.setCapacidadeKG(capacidadeKG);

        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "NHO012";
        element = Element.builder().name("capacidade_m3").text(capacidadeM3).build();
        when(object.getCapacidadeM3(element)).thenReturn(true);
        object.setCapacidadeM3(capacidadeM3);

        assertEquals(capacidadeM3, object.getCapacidadeM3());
    }

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "NHO012";
        element = Element.builder().name("capacidade_m3").text(capacidadeM3).build();
        when(object.setCapacidadeM3(element)).thenReturn(true);
        object.setCapacidadeM3(capacidadeM3);

        assertEquals(capacidadeM3, object.getCapacidadeM3());
    }

}