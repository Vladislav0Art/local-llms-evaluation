package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCodigoInternoSet_validadorIsNotNull {

    @Test
    public void codigoInternoSet_validadorIsNotNull() {
        final String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertNotNull(new DFStringValidador());
    }

}