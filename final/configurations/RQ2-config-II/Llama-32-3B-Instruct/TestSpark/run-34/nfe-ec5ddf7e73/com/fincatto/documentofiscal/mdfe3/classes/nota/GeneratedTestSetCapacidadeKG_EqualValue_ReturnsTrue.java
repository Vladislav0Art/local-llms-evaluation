package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeKG_EqualValue_ReturnsTrue {

    @Mock
    private DFStringValidador validador;

    public void setup() {
        when(validador.isValidar(anyString())).thenReturn(true);
    }

    @Test
    public void testSetCapacidadeKG_EqualValue_ReturnsTrue() {
        String capacidadeKG = "123.45";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeKG)).thenReturn(true);
        boolean result = object.setCapacidadeKG(capacidadeKG);
        assertThat(result, is(true));
    }

}