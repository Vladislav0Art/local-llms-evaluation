package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "456.78";
        Mockito.when(subject.getCapacidadeM3(null)).thenReturn(capacidadeM3);
        subject.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, subject.getCapacidadeM3());
    }

}