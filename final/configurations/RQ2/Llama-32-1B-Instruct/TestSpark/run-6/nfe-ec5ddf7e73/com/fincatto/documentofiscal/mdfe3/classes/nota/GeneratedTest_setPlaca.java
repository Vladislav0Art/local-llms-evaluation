package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        Mockito.when(subject.getPlaca(null)).thenReturn(placa);
        subject.setPlaca(placa);
        assertEquals(placa, subject.getPlaca());
    }

}