package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetRenavamTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavamTest() {
        String renavam = "renavam";
        reboque.setRenavam(renavam);
        Assert.assertEquals(renavam, reboque.getRenavam());
    }

}