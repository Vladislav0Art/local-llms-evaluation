package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetPlaca_InvalidValue_Tests {

    @Test
    public void setPlaca_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidPlaca = "12345678901234";
        mdf.setPlaca(invalidPlaca);
        assertEquals("1234567890123", mdf.getPlaca());
    }

}