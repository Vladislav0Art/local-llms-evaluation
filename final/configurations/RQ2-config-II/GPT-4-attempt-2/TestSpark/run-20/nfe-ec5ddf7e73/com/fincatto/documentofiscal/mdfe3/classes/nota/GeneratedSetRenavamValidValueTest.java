package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamValidValueTest {

    @Test
    public void setRenavamValidValueTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setRenavam("validRenavam");
        assertEquals("validRenavam", veiculoReboque.getRenavam());
    }

}