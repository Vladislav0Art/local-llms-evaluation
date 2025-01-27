package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetPlacaMocked {

    @Test
    public void setPlacaMocked() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        DFStringValidador validador = mock(DFStringValidador.class);
        when(validador.isValid(placa)).thenReturn(true);
        modal.setPlaca(placa, validador);
        assertEquals(placa, modal.getPlaca());
    }

}