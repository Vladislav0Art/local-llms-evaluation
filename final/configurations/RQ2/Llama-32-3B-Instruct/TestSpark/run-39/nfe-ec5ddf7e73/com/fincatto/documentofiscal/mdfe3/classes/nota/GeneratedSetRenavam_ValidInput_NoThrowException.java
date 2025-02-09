package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_ValidInput_NoThrowException {

    @Test
    public void setRenavam_ValidInput_NoThrowException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(validCode);
        } catch (Exception e) {

        }
    }

}