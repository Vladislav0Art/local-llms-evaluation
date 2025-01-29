package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_getCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "901.23";
        Mockito.when(subject.getCapacidadeM3("123.45")).thenReturn(capacidadeM3);
        String expected = "123.45";
        assertEquals(expected, subject.getCapacidadeM3());
    }

}