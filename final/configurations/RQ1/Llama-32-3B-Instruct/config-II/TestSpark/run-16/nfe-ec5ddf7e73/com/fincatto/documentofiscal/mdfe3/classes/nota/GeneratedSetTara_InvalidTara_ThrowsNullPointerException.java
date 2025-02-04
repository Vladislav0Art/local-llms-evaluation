package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTara_InvalidTara_ThrowsNullPointerException {

    @Test
    public void setTara_InvalidTara_ThrowsNullPointerException() {
        final String tara = "A";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
        assertEquals("Tara em reboque", exception.getMessage());
    }

}