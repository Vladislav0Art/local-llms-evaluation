package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.Mock;

public class GeneratedTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Test
    public void setCodigoInternoTest() {
        Mockito.doNothing().when(veiculoReboque).setCodigoInterno("ABCDEFGHIJ");
    }

    @Test
    public void setPlacaTest() {
        Mockito.doNothing().when(veiculoReboque).setPlaca("ABC1234");
    }

    @Test
    public void setRenavamTest() {
        Mockito.doNothing().when(veiculoReboque).setRenavam("12345678901");
    }

    @Test
    public void setTaraTest() {
        Mockito.doNothing().when(veiculoReboque).setTara("12345");
    }

    @Test
    public void getCapacidadeKGTest() {
        Mockito.when(veiculoReboque.getCapacidadeKG()).thenReturn("12345");
    }

    @Test
    public void setCapacidadeKGTest() {
        Mockito.doNothing().when(veiculoReboque).setCapacidadeKG("12345");
    }

    @Test
    public void getCapacidadeM3Test() {
        Mockito.when(veiculoReboque.getCapacidadeM3()).thenReturn("12");
    }

    @Test
    public void setCapacidadeM3Test() {
        Mockito.doNothing().when(veiculoReboque).setCapacidadeM3("12");
    }

}