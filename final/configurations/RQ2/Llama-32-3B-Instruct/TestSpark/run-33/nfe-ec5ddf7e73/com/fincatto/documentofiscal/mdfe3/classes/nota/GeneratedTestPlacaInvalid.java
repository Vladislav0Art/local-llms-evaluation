package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestPlacaInvalid {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPlacaInvalid() {
        when(validador.isValid(anyString())).thenReturn(false);
        try {
            obj.setPlaca("invalid");
            fail();
        } catch (Exception e) {
        }
    }

}