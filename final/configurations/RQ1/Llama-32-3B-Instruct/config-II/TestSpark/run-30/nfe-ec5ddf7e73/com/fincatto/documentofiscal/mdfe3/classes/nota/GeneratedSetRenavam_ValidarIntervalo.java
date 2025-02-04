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
public class GeneratedSetRenavam_ValidarIntervalo {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavam_ValidarIntervalo() {
        when(validador.validaIntervalo(anyString(), 9, 11, "Renavam do reboque")).thenReturn("renavam");
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("renavam");
        assertEquals("renavam", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}