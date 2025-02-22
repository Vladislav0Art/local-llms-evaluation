package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1111");
        assertEquals("AAA1111", reboque.getPlaca());
    }

}