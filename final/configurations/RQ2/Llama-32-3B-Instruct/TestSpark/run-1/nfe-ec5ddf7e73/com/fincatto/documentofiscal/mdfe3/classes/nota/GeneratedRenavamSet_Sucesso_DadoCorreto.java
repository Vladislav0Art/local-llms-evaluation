package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRenavamSet_Sucesso_DadoCorreto {

    @Test
    public void renavamSet_Sucesso_DadoCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "12345678901";
        modal.setRenavam(renavam);
        assertEquals(renavam, modal.getRenavam());
    }

}