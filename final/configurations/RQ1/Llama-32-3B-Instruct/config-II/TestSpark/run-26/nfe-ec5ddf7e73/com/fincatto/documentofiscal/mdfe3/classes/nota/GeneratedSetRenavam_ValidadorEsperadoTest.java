package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavam_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void setRenavam_ValidadorEsperadoTest() {
        when(validador.validaIntervalo("123456789", 9, 11, "Renavam do reboque")).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam("123456789");
        assertTrue(obj.getRenavam().equals("123456789"));
    }

}