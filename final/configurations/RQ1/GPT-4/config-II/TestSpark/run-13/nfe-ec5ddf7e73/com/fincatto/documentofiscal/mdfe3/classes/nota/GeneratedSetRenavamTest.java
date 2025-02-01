package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque infoRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        infoRodoviarioVeiculoReboque.setRenavam("12345678901");
        Assert.assertEquals("12345678901", infoRodoviarioVeiculoReboque.getRenavam());
    }

}