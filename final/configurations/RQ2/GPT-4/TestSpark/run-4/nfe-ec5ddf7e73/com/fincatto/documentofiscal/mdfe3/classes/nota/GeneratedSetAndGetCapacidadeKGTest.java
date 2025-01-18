package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetAndGetCapacidadeKGTest {

    @Test
    public void setAndGetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "3000";
        reboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}