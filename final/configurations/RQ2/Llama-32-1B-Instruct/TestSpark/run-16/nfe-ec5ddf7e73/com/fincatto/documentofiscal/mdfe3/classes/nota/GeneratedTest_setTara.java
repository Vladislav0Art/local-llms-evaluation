package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setTara {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        when(element.setAttribute("tara", tara)).thenReturn(element);
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}