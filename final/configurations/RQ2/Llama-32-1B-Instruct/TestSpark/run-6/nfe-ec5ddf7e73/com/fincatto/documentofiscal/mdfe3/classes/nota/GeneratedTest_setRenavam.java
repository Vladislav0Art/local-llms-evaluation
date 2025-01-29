package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        Mockito.when(subject.getRenavam(null)).thenReturn(renavam);
        subject.setRenavam(renavam);
        assertEquals(renavam, subject.getRenavam());
    }

}