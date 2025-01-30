package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTaraValidTest {

    @Test
    public void setTaraValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setTara("12345");
        Assert.assertEquals("12345", vehiculoReboque.getTara());
    }

}