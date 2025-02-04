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
public class GeneratedSetPlaca_PlaçaDeVeiculo {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_PlaçaDeVeiculo() {
        when(validador.placaDeVeiculo(anyString(), "Placa do reboque")).thenReturn("placa");
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("placa");
        assertEquals("placa", mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}