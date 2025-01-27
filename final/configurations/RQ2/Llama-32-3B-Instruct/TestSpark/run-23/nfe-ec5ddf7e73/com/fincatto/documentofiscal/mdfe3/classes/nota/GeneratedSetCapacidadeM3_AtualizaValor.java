package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeM3_AtualizaValor {

    @Mock
    private DFStringValidador stringValidador;

    @Test
    public void setCapacidadeM3_AtualizaValor() {
        this.setCapacidadeM3("10");
        String valor = this.getCapacidadeM3();
        assertEquals("10", valor);
    }
}

class MDFInfoModalRodoviarioVeiculoReboque {

    private String capacidadeKG;
    private String capacidadeM3;

    public String getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    public String getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

}