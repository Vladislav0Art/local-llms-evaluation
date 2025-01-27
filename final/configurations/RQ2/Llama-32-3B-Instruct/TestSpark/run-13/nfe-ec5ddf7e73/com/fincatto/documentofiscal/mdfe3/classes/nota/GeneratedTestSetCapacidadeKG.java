package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeKG {

    @Mock
    private DFStringValidador validador;

    @Mock
    private Map<String, String> dados;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void testSetCapacidadeKG() {
        objetoDeTeste.setCapacidadeKG("100kg");
        assertEquals("100kg", objetoDeTeste.getCapacidadeKG());
    }

}