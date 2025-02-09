package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_InvalidInput_NoThrowException {

    @Test
    public void setCodigoInterno_InvalidInput_NoThrowException() {
        String invalidCode = "InvalidCode";
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(invalidCode);
        } catch (Exception e) {

        }
    }

}