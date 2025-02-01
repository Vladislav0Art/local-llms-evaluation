package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", reboque.getPlaca());
    }

}