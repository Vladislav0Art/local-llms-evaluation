package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validCapacidadeM3 = "12";
        reboque.setCapacidadeM3(validCapacidadeM3);
        Assert.assertEquals(validCapacidadeM3, reboque.getCapacidadeM3());
    }

}