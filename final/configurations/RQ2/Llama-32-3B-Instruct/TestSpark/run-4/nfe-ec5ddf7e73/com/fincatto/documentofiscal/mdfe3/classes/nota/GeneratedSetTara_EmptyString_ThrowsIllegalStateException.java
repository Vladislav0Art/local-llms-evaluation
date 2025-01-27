package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_EmptyString_ThrowsIllegalStateException {

    @Test
    public void setTara_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(""));
    }

}