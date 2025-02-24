package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "1234567890";
        reboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

}