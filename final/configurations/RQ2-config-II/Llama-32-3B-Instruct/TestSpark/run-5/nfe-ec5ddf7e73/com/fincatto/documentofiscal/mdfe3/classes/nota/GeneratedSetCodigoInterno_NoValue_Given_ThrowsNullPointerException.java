package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInterno_NoValue_Given_ThrowsNullPointerException {

    private final String codigoInterno = "1234567890";
    private final String placa = "ABC-123";
    private final String renavam = "1234567890123";
    private final String tara = "100kg";
    private final String capacidadeKG = "5,000kg";
    private final String capacidadeM3 = "1.500m3";

    @Test
    public void setCodigoInterno_NoValue_Given_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(null));
    }

}