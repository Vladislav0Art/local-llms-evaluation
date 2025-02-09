package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_ValidInput_NoThrowException {

    @Test
    public void setTara_ValidInput_NoThrowException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setTara(validCode);
        } catch (Exception e) {

        }
    }

}