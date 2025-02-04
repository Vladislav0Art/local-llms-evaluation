package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_InvalidValue_ThrowsIllegalArgumentException {

    @Test
    public void setCapacidadeKG_InvalidValue_ThrowsIllegalArgumentException() {
        String capacidadeKG = "123456789abcde";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG));
    }

}