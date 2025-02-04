package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_NullValue_ThrowsNullPointerException {

    @Test
    public void setPlaca_NullValue_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(null));
    }

}