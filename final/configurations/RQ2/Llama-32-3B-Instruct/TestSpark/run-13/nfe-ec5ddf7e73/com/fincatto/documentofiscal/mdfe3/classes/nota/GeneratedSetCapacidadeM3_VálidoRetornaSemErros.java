package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeM3_VálidoRetornaSemErros {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setCapacidadeM3_VálidoRetornaSemErros() {
        String capacidadeM3 = "abc";
        when(validador.validar(capacidadeM3)).thenReturn(true);
        objetoDeTeste.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, objetoDeTeste.getCapacidadeM3());
    }

}