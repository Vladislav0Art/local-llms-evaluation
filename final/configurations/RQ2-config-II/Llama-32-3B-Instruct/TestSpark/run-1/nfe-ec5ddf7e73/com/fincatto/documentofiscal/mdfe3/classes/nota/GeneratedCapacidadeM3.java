package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCapacidadeM3 {

    @Mock
    private DFStringValidador validador;

    public MDFInfoModalRodoviarioVeiculoReboque testObj;

    public void setup() {
        testObj = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void capacidadeM3() {
        setup();
        when(validador.validate(testObj.getCapacidadeM3())).thenReturn(true);
        String result = testObj.getCapacidadeM3();
        assertNull(result);
    }

}