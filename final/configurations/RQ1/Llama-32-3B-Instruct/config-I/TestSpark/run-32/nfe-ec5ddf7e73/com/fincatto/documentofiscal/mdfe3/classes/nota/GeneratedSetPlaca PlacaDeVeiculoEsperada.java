package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetPlaca PlacaDeVeiculoEsperada {

    @Test
    public void setPlaca

    PlacaDeVeiculoEsperada() {
        // given
        final String placa = "123456";
        when(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque")).thenReturn("placa_do_reboque");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);

        // then
        assertEquals("placa_do_reboque", obj.getPlaca());
    }

}