package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "Test";
        testObject.setRenavam(renavam);
        assertEquals(renavam, testObject.getRenavam());
    }

}