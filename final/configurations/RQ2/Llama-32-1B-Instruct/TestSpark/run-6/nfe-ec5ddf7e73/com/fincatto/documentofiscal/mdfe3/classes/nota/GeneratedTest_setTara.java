package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setTara {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        Mockito.when(subject.getTara(null)).thenReturn(tara);
        subject.setTara(tara);
        assertEquals(tara, subject.getTara());
    }

}