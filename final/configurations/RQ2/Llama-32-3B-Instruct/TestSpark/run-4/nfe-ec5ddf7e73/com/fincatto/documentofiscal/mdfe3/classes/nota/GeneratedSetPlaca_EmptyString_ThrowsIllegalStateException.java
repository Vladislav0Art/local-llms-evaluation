package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_EmptyString_ThrowsIllegalStateException {

    @Test
    public void setPlaca_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(""));
    }

}