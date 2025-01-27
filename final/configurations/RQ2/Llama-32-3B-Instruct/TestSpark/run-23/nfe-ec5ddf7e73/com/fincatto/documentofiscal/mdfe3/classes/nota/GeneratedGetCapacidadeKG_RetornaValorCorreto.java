package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCapacidadeKG_RetornaValorCorreto {

    @Mock
    private DFStringValidador stringValidador;

    @Test
    public void getCapacidadeKG_RetornaValorCorreto() {
        String valor = this.getCapacidadeKG();
        assertEquals("valor", valor);
    }

}