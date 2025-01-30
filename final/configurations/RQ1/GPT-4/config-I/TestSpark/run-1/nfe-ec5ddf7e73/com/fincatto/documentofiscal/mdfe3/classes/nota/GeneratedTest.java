package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", veiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setPlaca("XYZ1234");
        Assert.assertEquals("XYZ1234", veiculoReboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setRenavam("123456789");
        Assert.assertEquals("123456789", veiculoReboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setTara("10000");
        Assert.assertEquals("10000", veiculoReboque.getTara());
    }

    @Test
    public void setAndGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeKG("10000");
        Assert.assertEquals("10000", veiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setAndGetCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("100");
        Assert.assertEquals("100", veiculoReboque.getCapacidadeM3());
    }

}