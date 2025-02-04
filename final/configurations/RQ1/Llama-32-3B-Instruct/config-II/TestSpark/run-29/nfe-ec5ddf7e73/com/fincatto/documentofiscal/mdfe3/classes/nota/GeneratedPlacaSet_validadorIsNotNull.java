package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedPlacaSet_validadorIsNotNull {

    @Test
    public void placaSet_validadorIsNotNull() {
        final String placa = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertNotNull(new DFStringValidador());
    }

}