package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInterno_InvalidValue_ThrowsNullPointerException {

    @Test
    public void setCodigoInterno_InvalidValue_ThrowsNullPointerException() {
        final String codigoInterno = "12345";
        final Exception exception = assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno));
        assertEquals("Codigo interno Veiculo Reboque", exception.getMessage());
    }

}