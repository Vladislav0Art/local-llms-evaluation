package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetRenavam IntervaloDeRenavamEsperado {

    @Test
    public void setRenavam

    IntervaloDeRenavamEsperado() {
        // given
        final String renavam = "123456789";
        when(DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque")).thenReturn("renavam_do_reboque");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);

        // then
        assertEquals("renavam_do_reboque", obj.getRenavam());
    }

}