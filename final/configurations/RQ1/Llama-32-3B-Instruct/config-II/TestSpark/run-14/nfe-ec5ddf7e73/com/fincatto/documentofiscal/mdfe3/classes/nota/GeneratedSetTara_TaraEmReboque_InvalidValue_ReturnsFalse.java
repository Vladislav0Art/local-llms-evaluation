package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_TaraEmReboque_InvalidValue_ReturnsFalse {

    @Test
    public void setTara_TaraEmReboque_InvalidValue_ReturnsFalse() {
        String tara = "123456789";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setTara(tara);
        assertTrue(!resultado);
    }

}