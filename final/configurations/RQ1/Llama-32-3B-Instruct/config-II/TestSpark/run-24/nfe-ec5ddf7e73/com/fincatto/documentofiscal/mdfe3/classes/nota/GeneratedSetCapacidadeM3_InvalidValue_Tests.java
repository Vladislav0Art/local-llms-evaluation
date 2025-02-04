package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetCapacidadeM3_InvalidValue_Tests {

    @Test
    public void setCapacidadeM3_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidadeM3 = "12345678901234";
        mdf.setCapacidadeM3(invalidCapacidadeM3);
        assertEquals("12", mdf.getCapacidadeM3());
    }

}