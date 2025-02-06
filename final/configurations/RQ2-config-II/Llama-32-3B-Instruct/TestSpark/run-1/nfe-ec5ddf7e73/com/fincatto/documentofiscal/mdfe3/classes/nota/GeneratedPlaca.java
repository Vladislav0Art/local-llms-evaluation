package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedPlaca {

    @Mock
    private DFStringValidador validador;

    public MDFInfoModalRodoviarioVeiculoReboque testObj;

    public void setup() {
        testObj = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void placa() {
        setup();
        when(validador.validate(testObj.getPlaca())).thenReturn(true);
        testObj.setPlaca("ABC123");
        assertEquals("ABC123", testObj.getPlaca());
    }

}