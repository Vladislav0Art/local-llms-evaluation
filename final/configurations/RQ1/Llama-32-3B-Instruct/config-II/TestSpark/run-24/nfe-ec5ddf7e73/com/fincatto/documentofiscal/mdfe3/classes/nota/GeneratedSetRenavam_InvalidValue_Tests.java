package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetRenavam_InvalidValue_Tests {

    @Test
    public void setRenavam_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidRenavam = "12345678901234";
        mdf.setRenavam(invalidRenavam);
        assertEquals("1234567890123", mdf.getRenavam());
    }

}