package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_getCapacidadeKG {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "123456";
        when(element.getAttribute("capacidade-kg")).thenReturn(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}