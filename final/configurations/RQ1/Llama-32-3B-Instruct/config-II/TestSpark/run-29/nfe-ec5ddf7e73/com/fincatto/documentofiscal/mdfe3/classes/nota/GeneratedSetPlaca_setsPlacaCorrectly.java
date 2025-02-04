package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_setsPlacaCorrectly {

    @Test
    public void setPlaca_setsPlacaCorrectly() {
        final String placa = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals(placa, new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}