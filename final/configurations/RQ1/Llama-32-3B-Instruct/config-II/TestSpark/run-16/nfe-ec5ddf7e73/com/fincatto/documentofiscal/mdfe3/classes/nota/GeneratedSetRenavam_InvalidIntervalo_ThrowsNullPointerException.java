package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavam_InvalidIntervalo_ThrowsNullPointerException {

    @Test
    public void setRenavam_InvalidIntervalo_ThrowsNullPointerException() {
        final String renavam = "12345";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
        assertEquals("Renavam do reboque", exception.getMessage());
    }

}