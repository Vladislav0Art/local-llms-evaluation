package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_ValidInput_ThrowsException {

    @Test
    public void setCodigoInterno_ValidInput_ThrowsException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(validCode);
        } catch (Exception e) {

        }
    }

}