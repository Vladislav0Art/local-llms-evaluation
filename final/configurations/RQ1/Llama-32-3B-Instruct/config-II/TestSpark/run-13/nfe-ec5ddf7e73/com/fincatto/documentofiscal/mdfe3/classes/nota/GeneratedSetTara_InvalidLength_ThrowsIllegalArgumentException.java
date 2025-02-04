package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_InvalidLength_ThrowsIllegalArgumentException {

    @Test
    public void setTara_InvalidLength_ThrowsIllegalArgumentException() {
        String tara = "123456789abcde";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
    }

}