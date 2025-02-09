package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String renavam = "987654321";
        info.setRenavam(renavam);
        Assert.assertEquals(renavam, info.getRenavam());
    }

}