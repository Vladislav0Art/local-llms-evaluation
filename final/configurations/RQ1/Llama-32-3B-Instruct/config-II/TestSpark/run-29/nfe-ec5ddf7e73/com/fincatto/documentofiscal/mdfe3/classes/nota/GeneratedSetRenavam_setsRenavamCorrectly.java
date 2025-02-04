package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_setsRenavamCorrectly {

    @Test
    public void setRenavam_setsRenavamCorrectly() {
        final String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals(renavam, new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

}