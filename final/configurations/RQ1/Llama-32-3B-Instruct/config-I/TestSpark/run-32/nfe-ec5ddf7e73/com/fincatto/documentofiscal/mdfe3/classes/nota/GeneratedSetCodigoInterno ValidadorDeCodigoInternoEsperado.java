package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetCodigoInterno ValidadorDeCodigoInternoEsperado {

    @Test
    public void setCodigoInterno

    ValidadorDeCodigoInternoEsperado() {
        // given
        final String codigoInterno = "1234567890";
        when(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("codigo_interno");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);

        // then
        assertEquals("codigo_interno", obj.getCodigoInterno());
    }

}