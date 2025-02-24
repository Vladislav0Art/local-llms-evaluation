package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedSetRenavamTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavamTest() {
        String renavam = "12345678901234";
        reboque.setRenavam(renavam);
        assertEquals(renavam, reboque.getRenavam());
    }

}