package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetTara_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void setTara_ValidadorEsperadoTest() {
        when(validador.capacidadeNDigitos("10", "Tara em reboque", 5)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara("10");
        assertTrue(obj.getTara().equals("10"));
    }

}