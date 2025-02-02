package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRenavamSetValidoTest {

    @Test
    public void renavamSetValidoTest() {
        String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("123456789", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

}