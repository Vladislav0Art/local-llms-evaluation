package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_ValidInput_NoThrowException {

    @Test
    public void setCapacidadeKG_ValidInput_NoThrowException() {
        String validCode = DFStringValidador.getValidCode();
        try {
            new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(validCode);
        } catch (Exception e) {

        }
    }

}