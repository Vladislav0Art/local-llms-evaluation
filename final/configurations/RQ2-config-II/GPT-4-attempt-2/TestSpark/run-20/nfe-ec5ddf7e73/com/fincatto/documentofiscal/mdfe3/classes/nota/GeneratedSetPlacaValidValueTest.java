package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaValidValueTest {

    @Test
    public void setPlacaValidValueTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setPlaca("validPlaca");
        assertEquals("validPlaca", veiculoReboque.getPlaca());
    }

}