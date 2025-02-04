package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTaraSet_validadorIsNotNull {

    @Test
    public void taraSet_validadorIsNotNull() {
        final String tara = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertNotNull(new DFStringValidador());
    }

}