package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetRenavam_DadoValorValido_EstabeleceRenavamCorretamente {

    @Test
    public void setRenavam_DadoValorValido_EstabeleceRenavamCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "AB123456";
        modal.setRenavam(renavam);
        assertEquals(renavam, modal.getRenavam());
    }

}