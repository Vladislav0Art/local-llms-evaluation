package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeKGSet_validadorIsNotNull {

    @Test
    public void capacidadeKGSet_validadorIsNotNull() {
        final String capacidadeKG = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertNotNull(new DFStringValidador());
    }

}