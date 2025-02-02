package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetRenavam_RenavamValidadorTest {

    @Test
    public void setRenavam_RenavamValidadorTest() {
        final String renavam = "123456789";
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals(renavam, new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

}