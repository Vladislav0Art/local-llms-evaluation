package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCodigoInterno {

    @Test
    public void testSetCodigoInterno() {
        String codigoInterno = "001";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}