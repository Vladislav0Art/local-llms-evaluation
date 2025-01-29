package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetRenavam {

    @Test
    public void testSetRenavam() {
        String renavam = "DEF456";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}