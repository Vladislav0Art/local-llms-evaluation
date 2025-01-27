package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        String renavam = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}