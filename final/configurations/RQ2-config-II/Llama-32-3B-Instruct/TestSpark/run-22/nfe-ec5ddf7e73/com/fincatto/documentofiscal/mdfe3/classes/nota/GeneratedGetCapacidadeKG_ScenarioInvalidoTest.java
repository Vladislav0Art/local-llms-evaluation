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
public class GeneratedGetCapacidadeKG_ScenarioInvalidoTest {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void getCapacidadeKG_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("capacidadeKgDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}