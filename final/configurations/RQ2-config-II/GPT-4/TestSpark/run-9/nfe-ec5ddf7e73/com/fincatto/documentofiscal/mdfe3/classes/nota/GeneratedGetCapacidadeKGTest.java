package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque rodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        rodoviarioVeiculoReboque.setCapacidadeKG("1000");
        Assert.assertEquals("1000", rodoviarioVeiculoReboque.getCapacidadeKG());
    }

}