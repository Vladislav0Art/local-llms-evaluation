package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedTestSetPlacaMockito {

    @Test
    public void testSetPlacaMockito() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String placa = "1234567890";
        DFStringValidador placaDeVeiculo = Mockito.mock(DFStringValidador.class);
        when(placaDeVeiculo.placaDeVeiculo(placa, "Placa do reboque")).thenReturn(true);
        modalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, modalRodoviarioVeiculoReboque.getPlaca());
    }
}

}