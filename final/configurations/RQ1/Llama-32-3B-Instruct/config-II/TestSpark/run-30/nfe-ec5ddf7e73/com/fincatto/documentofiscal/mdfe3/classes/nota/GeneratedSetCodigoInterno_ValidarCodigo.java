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
public class GeneratedSetCodigoInterno_ValidarCodigo {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_ValidarCodigo() {
        when(validador.validador(anyString(), "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("codigo");
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("codigo");
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}