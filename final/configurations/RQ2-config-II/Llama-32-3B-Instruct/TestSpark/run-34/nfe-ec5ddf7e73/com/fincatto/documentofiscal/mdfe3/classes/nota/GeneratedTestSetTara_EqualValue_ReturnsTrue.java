package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetTara_EqualValue_ReturnsTrue {

    @Mock
    private DFStringValidador validador;

    public void setup() {
        when(validador.isValidar(anyString())).thenReturn(true);
    }

    @Test
    public void testSetTara_EqualValue_ReturnsTrue() {
        String tara = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(tara)).thenReturn(true);
        boolean result = object.setTara(tara);
        assertThat(result, is(true));
    }

}