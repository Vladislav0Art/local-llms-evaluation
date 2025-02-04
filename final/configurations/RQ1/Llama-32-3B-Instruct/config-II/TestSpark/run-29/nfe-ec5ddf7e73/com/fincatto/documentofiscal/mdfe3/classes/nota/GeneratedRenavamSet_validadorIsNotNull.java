package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedRenavamSet_validadorIsNotNull {

    @Test
    public void renavamSet_validadorIsNotNull() {
        final String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertNotNull(new DFStringValidador());
    }

}