package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetTara_InvalidValue_Tests {

    @Test
    public void setTara_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidTara = "12345678901234";
        mdf.setTara(invalidTara);
        assertEquals("12345", mdf.getTara());
    }

}