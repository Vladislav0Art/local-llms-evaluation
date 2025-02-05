package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque rodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        rodoviarioVeiculoReboque.setTara("500");
        Assert.assertEquals("500", rodoviarioVeiculoReboque.getTara());
    }

}