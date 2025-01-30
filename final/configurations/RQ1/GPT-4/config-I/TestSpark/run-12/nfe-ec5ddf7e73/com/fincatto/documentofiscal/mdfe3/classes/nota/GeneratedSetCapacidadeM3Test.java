package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, veiculoReboque.getCapacidadeM3());
    }

}