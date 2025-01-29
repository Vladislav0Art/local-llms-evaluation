package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        String placa = "ABC123";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}