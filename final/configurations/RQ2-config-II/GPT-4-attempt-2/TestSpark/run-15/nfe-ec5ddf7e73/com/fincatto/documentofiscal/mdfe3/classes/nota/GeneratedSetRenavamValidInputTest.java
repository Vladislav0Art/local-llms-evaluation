package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamValidInputTest {

    @Test
    public void setRenavamValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

}