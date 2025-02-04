package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlaca_InvalidPlaca_ThrowsNullPointerException {

    @Test
    public void setPlaca_InvalidPlaca_ThrowsNullPointerException() {
        final String placa = "A";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa));
        assertEquals("Placa do reboque", exception.getMessage());
    }

}