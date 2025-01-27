package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_EmptyString_ThrowsIllegalStateException {

    @Test
    public void setCodigoInterno_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(""));
    }

}