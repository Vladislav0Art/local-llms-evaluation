package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_setsCodigoInternoCorrectly {

    @Test
    public void setCodigoInterno_setsCodigoInternoCorrectly() {
        final String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}