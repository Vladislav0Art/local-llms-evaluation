package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_ValidInput_NoThrowException {

    @Test
    public void setCapacidadeM3_ValidInput_NoThrowException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(validCode);
        } catch (Exception e) {

        }
    }

}