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
public class GeneratedSetCapacidadeKG_CapacidadeNDigitos {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeKG_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Capacidade em KG reboque", 5)).thenReturn("capacidade");
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("capacidade");
        assertEquals("capacidade", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}