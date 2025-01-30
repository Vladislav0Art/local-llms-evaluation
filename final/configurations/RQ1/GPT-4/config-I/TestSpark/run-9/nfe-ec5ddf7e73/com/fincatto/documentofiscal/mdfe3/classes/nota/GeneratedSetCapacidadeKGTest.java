package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validCapacidade = "12345";
        reboque.setCapacidadeKG(validCapacidade);
        Assert.assertEquals(validCapacidade, reboque.getCapacidadeKG());
    }

}