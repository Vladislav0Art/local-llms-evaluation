package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetCapacidadeKG_InvalidValue_Tests {

    @Test
    public void setCapacidadeKG_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidade = "abcdefg";
        mdf.setCapacidadeKG(invalidCapacidade);
        assertEquals("abc", mdf.getCapacidadeKG());
    }

}