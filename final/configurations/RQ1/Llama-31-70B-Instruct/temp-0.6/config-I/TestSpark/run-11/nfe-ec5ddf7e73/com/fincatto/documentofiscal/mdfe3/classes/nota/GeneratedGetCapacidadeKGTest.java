package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.Mock;

public class GeneratedGetCapacidadeKGTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Test
    public void getCapacidadeKGTest() {
        Mockito.when(veiculoReboque.getCapacidadeKG()).thenReturn("12345");
    }

}