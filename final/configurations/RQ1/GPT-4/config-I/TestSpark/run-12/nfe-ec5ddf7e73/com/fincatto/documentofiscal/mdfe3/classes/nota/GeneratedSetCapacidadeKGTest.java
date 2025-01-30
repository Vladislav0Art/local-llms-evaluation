package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, veiculoReboque.getCapacidadeKG());
    }

}