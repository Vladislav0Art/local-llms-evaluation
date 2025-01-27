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
public class GeneratedTestSetCapacidadeM3 {

    @Mock
    private DFStringValidador validador;

    @Mock
    private Map<String, String> dados;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void testSetCapacidadeM3() {
        objetoDeTeste.setCapacidadeM3("100m3");
        assertEquals("100m3", objetoDeTeste.getCapacidadeM3());
    }

}