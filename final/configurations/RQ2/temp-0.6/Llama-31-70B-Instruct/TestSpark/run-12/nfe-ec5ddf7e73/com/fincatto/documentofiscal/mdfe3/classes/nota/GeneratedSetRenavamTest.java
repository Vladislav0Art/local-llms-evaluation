package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("1234567890");
        assertEquals("1234567890", reboque.getRenavam());
    }

}