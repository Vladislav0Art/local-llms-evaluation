package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("abc123");
        Assert.assertEquals("abc123", reboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoExceedingLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("abcdefghijk");
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", reboque.getPlaca());
    }

    @Test
    public void setPlacaInvalidFormatTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AA1234");
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("123456789");
        Assert.assertEquals("123456789", reboque.getRenavam());
    }

    @Test
    public void setRenavamExceedingLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("123456789012");
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        Assert.assertEquals("12345", reboque.getTara());
    }

    @Test
    public void setTaraExceedingLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("123456");
    }

    @Test
    public void getSetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        Assert.assertEquals("12345", reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGExceedingLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("123456");
    }

    @Test
    public void getSetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        Assert.assertEquals("12", reboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3ExceedingLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("123");
    }

}