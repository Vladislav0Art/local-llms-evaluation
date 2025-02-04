package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_InvalidIntervalo_ThrowsIllegalArgumentException {

    @Test
    public void setRenavam_InvalidIntervalo_ThrowsIllegalArgumentException() {
        String renavam = "12345678901234";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
    }

}