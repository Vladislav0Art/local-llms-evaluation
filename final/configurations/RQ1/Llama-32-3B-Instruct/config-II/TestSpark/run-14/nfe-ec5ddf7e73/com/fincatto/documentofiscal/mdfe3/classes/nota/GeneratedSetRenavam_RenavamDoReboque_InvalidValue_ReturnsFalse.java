package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_RenavamDoReboque_InvalidValue_ReturnsFalse {

    @Test
    public void setRenavam_RenavamDoReboque_InvalidValue_ReturnsFalse() {
        String renavam = "12345678901234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setRenavam(renavam);
        assertFalse(resultado);
    }

}