package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCapacidadeM3_RetornaValorCorreto {

    @Mock
    private DFStringValidador stringValidador;

    @Test
    public void getCapacidadeM3_RetornaValorCorreto() {
        String valor = this.getCapacidadeM3();
        assertEquals("valor", valor);
    }

}