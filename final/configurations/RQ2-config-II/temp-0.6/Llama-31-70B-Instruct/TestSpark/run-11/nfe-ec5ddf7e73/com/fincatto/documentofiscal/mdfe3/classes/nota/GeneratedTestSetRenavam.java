package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetRenavam {

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setRenavam("12345678901");

        assertEquals("12345678901", veiculoReboque.getRenavam());
    }

}