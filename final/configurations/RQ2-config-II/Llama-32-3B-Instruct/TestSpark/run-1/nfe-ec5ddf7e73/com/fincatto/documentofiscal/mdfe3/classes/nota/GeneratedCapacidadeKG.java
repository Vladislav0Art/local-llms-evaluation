package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCapacidadeKG {

    @Mock
    private DFStringValidador validador;

    public MDFInfoModalRodoviarioVeiculoReboque testObj;

    public void setup() {
        testObj = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void capacidadeKG() {
        setup();
        when(validador.validate(testObj.getCapacidadeKG())).thenReturn(true);
        testObj.setCapacidadeKG("456789");
        assertEquals("456789", testObj.getCapacidadeKG());
    }

}