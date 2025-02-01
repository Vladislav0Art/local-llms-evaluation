package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetGetCapacidadeKGTest {

    @Test
    public void setGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

}