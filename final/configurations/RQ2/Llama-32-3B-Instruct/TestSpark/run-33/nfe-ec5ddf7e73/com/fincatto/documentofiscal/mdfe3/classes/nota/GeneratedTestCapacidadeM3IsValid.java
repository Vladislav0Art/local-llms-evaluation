package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCapacidadeM3IsValid {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCapacidadeM3IsValid() {
        when(validador.isValid(anyString())).thenReturn(true);
        obj.setCapacidadeM3("capacidadeM3");
        assertEquals("", obj.getCapacidadeM3());
    }

}