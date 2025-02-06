package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPlaca_ScenarioInvalidoTest {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void getPlaca_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setPlaca("placaDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}