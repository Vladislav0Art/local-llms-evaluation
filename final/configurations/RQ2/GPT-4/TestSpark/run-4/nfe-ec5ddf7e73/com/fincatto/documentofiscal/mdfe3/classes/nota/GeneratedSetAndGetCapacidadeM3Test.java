package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetAndGetCapacidadeM3Test {

    @Test
    public void setAndGetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "4000";
        reboque.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, reboque.getCapacidadeM3());
    }

}