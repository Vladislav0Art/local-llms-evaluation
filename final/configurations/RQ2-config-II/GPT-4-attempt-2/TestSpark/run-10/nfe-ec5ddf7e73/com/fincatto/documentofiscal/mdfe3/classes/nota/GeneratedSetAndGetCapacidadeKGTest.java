package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetAndGetCapacidadeKGTest {

    @Test
    public void setAndGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeKG("2000");
        Assert.assertEquals("2000", veiculoReboque.getCapacidadeKG());
    }

}