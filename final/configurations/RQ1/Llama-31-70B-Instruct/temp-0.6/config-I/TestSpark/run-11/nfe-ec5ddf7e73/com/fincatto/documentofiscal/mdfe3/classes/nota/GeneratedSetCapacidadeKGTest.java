package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.Mock;

public class GeneratedSetCapacidadeKGTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Test
    public void setCapacidadeKGTest() {
        Mockito.doNothing().when(veiculoReboque).setCapacidadeKG("12345");
    }

}