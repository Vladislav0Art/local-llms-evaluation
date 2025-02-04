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
public class GeneratedSetTara_CapacidadeNDigitos {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTara_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Tara em reboque", 5)).thenReturn("tara");
        mdfInfoModalRodoviarioVeiculoReboque.setTara("tara");
        assertEquals("tara", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}