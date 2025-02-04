package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlaca_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void setPlaca_ValidadorEsperadoTest() {
        when(validador.placaDeVeiculo("ABC123", "Placa do reboque")).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("ABC123");
        assertTrue(obj.getPlaca().equals("ABC123"));
    }

}