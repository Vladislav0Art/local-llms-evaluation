package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "12345";
        Mockito.when(subject.getCodigoInterno(null)).thenReturn(codigoInterno);
        subject.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, subject.getCodigoInterno());
    }

}