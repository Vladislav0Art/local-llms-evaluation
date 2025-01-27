package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamTest1 {

    @Test
    public void setRenavamTest1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamExpected = "123456";
        obj.setRenavam(renavamExpected);
        assertEquals(renavamExpected, obj.getRenavam());
    }

}