package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", veiculo.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setPlaca("ABC1234");
        Assert.assertEquals("ABC1234", veiculo.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setRenavam("123456789");
        Assert.assertEquals("123456789", veiculo.getRenavam());
    }

    @Test
    public void setTaraTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setTara("12345");
        Assert.assertEquals("12345", veiculo.getTara());
    }

    @Test
    public void setAndGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeKG("12345");
        Assert.assertEquals("12345", veiculo.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeM3("12");
        Assert.assertEquals("12", veiculo.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeM3("12");
        Assert.assertEquals("12", veiculo.getCapacidadeM3());
    }

}