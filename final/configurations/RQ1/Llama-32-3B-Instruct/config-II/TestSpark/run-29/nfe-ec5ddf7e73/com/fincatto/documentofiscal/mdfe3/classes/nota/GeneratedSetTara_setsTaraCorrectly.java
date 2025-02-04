package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_setsTaraCorrectly {

    @Test
    public void setTara_setsTaraCorrectly() {
        final String tara = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals(tara, new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}