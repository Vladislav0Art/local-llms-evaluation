package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "1234567890";
        when(element.setAttribute("codigo-interno", codigoInterno)).thenReturn(element);
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        when(element.setAttribute("placa", placa)).thenReturn(element);
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        when(element.setAttribute("renavam", renavam)).thenReturn(element);
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        when(element.setAttribute("tara", tara)).thenReturn(element);
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "123456";
        when(element.getAttribute("capacidade-kg")).thenReturn(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "123456";
        when(element.getAttribute("capacidade-kg")).thenReturn(capacidadeKG);
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "123456";
        when(element.getAttribute("capacidade-m3")).thenReturn(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "123456";
        when(element.getAttribute("capacidade-m3")).thenReturn(capacidadeM3);
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}