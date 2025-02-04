package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.simpleframework.xml.Element;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeM3_CapacidadeNDigitos {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeM3_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Capacidade em M3 reboque", 2)).thenReturn("m3");
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("m3");
        assertEquals("m3", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}