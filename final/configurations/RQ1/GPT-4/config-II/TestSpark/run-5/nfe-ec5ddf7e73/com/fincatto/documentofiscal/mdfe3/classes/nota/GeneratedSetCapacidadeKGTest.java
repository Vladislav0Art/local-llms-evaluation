package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeKG("12345");
        Assert.assertEquals("12345", veiculoReboque.getCapacidadeKG());
    }

}