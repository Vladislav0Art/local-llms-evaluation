package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeKG_AtualizaValor {

    @Mock
    private DFStringValidador stringValidador;

    @Test
    public void setCapacidadeKG_AtualizaValor() {
        this.setCapacidadeKG("10");
        String valor = this.getCapacidadeKG();
        assertEquals("10", valor);
    }

}