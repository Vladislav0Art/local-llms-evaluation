package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, veiculoReboque.getCapacidadeM3());
    }

}