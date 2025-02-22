package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestSetPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
        assertEquals("AAA1234", reboque.getPlaca());
    }

}