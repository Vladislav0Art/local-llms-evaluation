package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetCodigoInterno_InvalidFormat_Tests {

    @Test
    public void setCodigoInterno_InvalidFormat_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidPlaca = "1234567890123";
        mdf.setPlaca(invalidPlaca);
        assertEquals("ABCDEF", mdf.getCodigoInterno());
    }

}