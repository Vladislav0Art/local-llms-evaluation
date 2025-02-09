package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setRenavam("1234567890");
        Assert.assertEquals("1234567890", veiculoReboque.getRenavam());
    }

}