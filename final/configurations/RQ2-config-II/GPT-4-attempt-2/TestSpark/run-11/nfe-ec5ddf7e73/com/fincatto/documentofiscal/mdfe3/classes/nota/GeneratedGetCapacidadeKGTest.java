package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeKG("500");
        Assert.assertEquals("500", veiculoReboque.getCapacidadeKG());
    }

}