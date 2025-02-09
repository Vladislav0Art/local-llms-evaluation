package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInternoValidValueTest {

    @Test
    public void setCodigoInternoValidValueTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno("validCode");
        assertEquals("validCode", veiculoReboque.getcodigoInterno());
    }

}