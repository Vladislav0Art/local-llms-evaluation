package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque infoRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        infoRodoviarioVeiculoReboque.setTara("12345");
        Assert.assertEquals("12345", infoRodoviarioVeiculoReboque.getTara());
    }

}