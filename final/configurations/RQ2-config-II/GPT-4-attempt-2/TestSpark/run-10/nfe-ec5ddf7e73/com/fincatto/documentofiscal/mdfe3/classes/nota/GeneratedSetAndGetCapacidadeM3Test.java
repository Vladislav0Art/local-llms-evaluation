package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetAndGetCapacidadeM3Test {

    @Test
    public void setAndGetCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("3000");
        Assert.assertEquals("3000", veiculoReboque.getCapacidadeM3());
    }

}