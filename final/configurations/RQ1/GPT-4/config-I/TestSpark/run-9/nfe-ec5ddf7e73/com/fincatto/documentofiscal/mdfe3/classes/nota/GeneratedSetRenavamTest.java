package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validRenavam = "123456789";
        reboque.setRenavam(validRenavam);
        Assert.assertEquals(validRenavam, reboque.getRenavam());
    }

}