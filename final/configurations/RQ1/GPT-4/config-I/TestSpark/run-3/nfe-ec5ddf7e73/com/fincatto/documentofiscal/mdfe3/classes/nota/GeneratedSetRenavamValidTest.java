package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamValidTest {

    @Test
    public void setRenavamValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setRenavam("12345678901");
        Assert.assertEquals("12345678901", vehiculoReboque.getRenavam());
    }

}