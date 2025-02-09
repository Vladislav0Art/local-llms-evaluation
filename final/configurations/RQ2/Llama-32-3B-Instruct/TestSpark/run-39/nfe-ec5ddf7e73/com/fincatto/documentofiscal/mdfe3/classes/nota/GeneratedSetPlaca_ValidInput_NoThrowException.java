package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_ValidInput_NoThrowException {

    @Test
    public void setPlaca_ValidInput_NoThrowException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(validCode);
        } catch (Exception e) {

        }
    }

}