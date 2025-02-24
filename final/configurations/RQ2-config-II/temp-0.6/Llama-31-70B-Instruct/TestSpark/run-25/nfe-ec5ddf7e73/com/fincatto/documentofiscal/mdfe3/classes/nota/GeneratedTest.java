package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedCodigoInterno = "123456";
        veiculoReboque.setCodigoInterno(expectedCodigoInterno);
        assertEquals(expectedCodigoInterno, veiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedPlaca = "AAA1234";
        veiculoReboque.setPlaca(expectedPlaca);
        assertEquals(expectedPlaca, veiculoReboque.getPlaca());
    }

}