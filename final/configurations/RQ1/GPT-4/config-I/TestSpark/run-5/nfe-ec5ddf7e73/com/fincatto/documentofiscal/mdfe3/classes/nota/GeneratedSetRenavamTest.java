package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque rodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        rodoviarioVeiculoReboque.setRenavam("123456789");
        Assert.assertEquals("123456789", rodoviarioVeiculoReboque.getRenavam());
    }

}