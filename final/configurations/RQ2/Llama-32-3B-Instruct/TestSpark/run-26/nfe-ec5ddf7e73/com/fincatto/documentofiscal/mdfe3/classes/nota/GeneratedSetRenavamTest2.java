package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamTest2 {

    @Test
    public void setRenavamTest2() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamExpected = "789012";
        obj.setRenavam(renavamExpected);
        assertEquals(renavamExpected, obj.getRenavam());
    }

}