package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", reboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("12345678901");
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("ABC1234");
        Assert.assertEquals("ABC1234", reboque.getPlaca());
    }

    @Test
    public void setPlacaInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("ABCDE1234");
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validRenavam = "123456789";
        reboque.setRenavam(validRenavam);
        Assert.assertEquals(validRenavam, reboque.getRenavam());
    }

    @Test
    public void setRenavamInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String invalidRenavam = "12345678";
        reboque.setRenavam(invalidRenavam);
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        Assert.assertEquals("12345", reboque.getTara());
    }

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validCapacidade = "12345";
        reboque.setCapacidadeKG(validCapacidade);
        Assert.assertEquals(validCapacidade, reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String invalidCapacidade = "123456";
        reboque.setCapacidadeKG(invalidCapacidade);
    }

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String validCapacidadeM3 = "12";
        reboque.setCapacidadeM3(validCapacidadeM3);
        Assert.assertEquals(validCapacidadeM3, reboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3InvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String invalidCapacidadeM3 = "123";
        reboque.setCapacidadeM3(invalidCapacidadeM3);
    }

}