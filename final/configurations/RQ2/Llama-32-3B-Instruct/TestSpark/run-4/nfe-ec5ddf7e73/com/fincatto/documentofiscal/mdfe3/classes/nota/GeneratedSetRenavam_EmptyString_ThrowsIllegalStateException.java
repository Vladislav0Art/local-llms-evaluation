package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_EmptyString_ThrowsIllegalStateException {

    @Test
    public void setRenavam_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(""));
    }

}