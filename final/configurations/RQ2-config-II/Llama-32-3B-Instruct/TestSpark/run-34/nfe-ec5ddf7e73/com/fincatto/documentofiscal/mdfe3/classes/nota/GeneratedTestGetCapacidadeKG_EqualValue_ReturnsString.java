package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetCapacidadeKG_EqualValue_ReturnsString {

    @Mock
    private DFStringValidador validador;

    public void setup() {
        when(validador.isValidar(anyString())).thenReturn(true);
    }

    @Test
    public void testGetCapacidadeKG_EqualValue_ReturnsString() {
        String capacidadeKG = "123.45";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeKG)).thenReturn(true);
        String result = object.getCapacidadeKG();
        assertThat(result, is(capacidadeKG));
    }

}