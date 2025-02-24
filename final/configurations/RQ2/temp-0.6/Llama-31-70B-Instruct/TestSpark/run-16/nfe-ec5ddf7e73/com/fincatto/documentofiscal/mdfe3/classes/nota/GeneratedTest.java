package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "codigoInterno";
        reboque.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        String placa = "placa";
        reboque.setPlaca(placa);
        Assert.assertEquals(placa, reboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        String renavam = "renavam";
        reboque.setRenavam(renavam);
        Assert.assertEquals(renavam, reboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        String tara = "tara";
        reboque.setTara(tara);
        Assert.assertEquals(tara, reboque.getTara());
    }

    @Test
    public void getCapacidadeKGTest() {
        String capacidadeKG = "capacidadeKG";
        reboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}