package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedSetCodigoInternoExceptionTest {

    @Test
    public void setCodigoInternoExceptionTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno("12345678901");
        assertNotNull(veiculoReboque.getCodigoInterno());
    }

}