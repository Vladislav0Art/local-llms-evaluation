package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "12345";
        Mockito.when(subject.getCodigoInterno(null)).thenReturn(codigoInterno);
        subject.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, subject.getCodigoInterno());
    }

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        Mockito.when(subject.getPlaca(null)).thenReturn(placa);
        subject.setPlaca(placa);
        assertEquals(placa, subject.getPlaca());
    }

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        Mockito.when(subject.getRenavam(null)).thenReturn(renavam);
        subject.setRenavam(renavam);
        assertEquals(renavam, subject.getRenavam());
    }

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        Mockito.when(subject.getTara(null)).thenReturn(tara);
        subject.setTara(tara);
        assertEquals(tara, subject.getTara());
    }

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "123.45";
        Mockito.when(subject.getCapacidadeKG("123.45")).thenReturn(capacidadeKG);
        String expected = "123.45";
        assertEquals(expected, subject.getCapacidadeKG());
    }

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "456.78";
        Mockito.when(subject.getCapacidadeKG(null)).thenReturn(capacidadeKG);
        subject.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, subject.getCapacidadeKG());
    }

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "901.23";
        Mockito.when(subject.getCapacidadeM3("123.45")).thenReturn(capacidadeM3);
        String expected = "123.45";
        assertEquals(expected, subject.getCapacidadeM3());
    }

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "456.78";
        Mockito.when(subject.getCapacidadeM3(null)).thenReturn(capacidadeM3);
        subject.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, subject.getCapacidadeM3());
    }

}