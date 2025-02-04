package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCodigoInternoSet_invalidadorIsNotNull {

    @Test
    public void codigoInternoSet_invalidadorIsNotNull() {
        final String codigoInterno = "abcde";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertNotNull(new DFStringValidador());
    }

}