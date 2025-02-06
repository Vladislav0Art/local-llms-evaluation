package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeM3_EqualValue_ReturnsTrue {

    @Mock
    private DFStringValidador validador;

    public void setup() {
        when(validador.isValidar(anyString())).thenReturn(true);
    }

    @Test
    public void testSetCapacidadeM3_EqualValue_ReturnsTrue() {
        String capacidadeM3 = "456.78";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeM3)).thenReturn(true);
        boolean result = object.setCapacidadeM3(capacidadeM3);
        assertThat(result, is(true));
    }

}