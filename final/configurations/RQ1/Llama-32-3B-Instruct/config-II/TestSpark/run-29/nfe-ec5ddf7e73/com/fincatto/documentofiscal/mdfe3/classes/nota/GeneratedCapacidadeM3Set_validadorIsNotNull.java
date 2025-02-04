package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeM3Set_validadorIsNotNull {

    @Test
    public void capacidadeM3Set_validadorIsNotNull() {
        final String capacidadeM3 = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertNotNull(new DFStringValidador());
    }

}