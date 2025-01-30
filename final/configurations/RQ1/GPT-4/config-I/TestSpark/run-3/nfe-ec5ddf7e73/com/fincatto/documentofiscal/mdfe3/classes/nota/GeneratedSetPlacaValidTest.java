package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaValidTest {

    @Test
    public void setPlacaValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setPlaca("P1A2C3");
        Assert.assertEquals("P1A2C3", vehiculoReboque.getPlaca());
    }

}