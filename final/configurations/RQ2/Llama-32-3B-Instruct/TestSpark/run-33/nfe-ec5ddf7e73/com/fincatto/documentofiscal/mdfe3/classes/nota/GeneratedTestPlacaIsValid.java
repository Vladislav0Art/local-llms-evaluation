package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestPlacaIsValid {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPlacaIsValid() {
        when(validador.isValid(anyString())).thenReturn(true);
        obj.setPlaca("placa");
        assertEquals("", obj.getPlaca());
    }

}