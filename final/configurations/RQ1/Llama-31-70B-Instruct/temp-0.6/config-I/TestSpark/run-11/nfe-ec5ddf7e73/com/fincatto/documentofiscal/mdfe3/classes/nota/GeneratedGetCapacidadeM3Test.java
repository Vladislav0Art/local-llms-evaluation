package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.Mock;

public class GeneratedGetCapacidadeM3Test {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Test
    public void getCapacidadeM3Test() {
        Mockito.when(veiculoReboque.getCapacidadeM3()).thenReturn("12");
    }

}