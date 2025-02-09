package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String codigoInterno = "123456789";
        info.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, info.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String placa = "ABC1234";
        info.setPlaca(placa);
        Assert.assertEquals(placa, info.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String renavam = "987654321";
        info.setRenavam(renavam);
        Assert.assertEquals(renavam, info.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String tara = "2000";
        info.setTara(tara);
        Assert.assertEquals(tara, info.getTara());
    }

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeKG = "5000";
        info.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, info.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeM3 = "15";
        info.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, info.getCapacidadeM3());
    }

}