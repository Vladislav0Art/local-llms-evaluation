package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_getCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "123.45";
        Mockito.when(subject.getCapacidadeKG("123.45")).thenReturn(capacidadeKG);
        String expected = "123.45";
        assertEquals(expected, subject.getCapacidadeKG());
    }

}