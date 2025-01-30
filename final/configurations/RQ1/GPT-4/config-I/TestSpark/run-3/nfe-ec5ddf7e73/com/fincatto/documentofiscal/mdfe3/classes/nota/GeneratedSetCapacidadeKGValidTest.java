package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeKGValidTest {

    @Test
    public void setCapacidadeKGValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setCapacidadeKG("12345");
        Assert.assertEquals("12345", vehiculoReboque.getCapacidadeKG());
    }

}