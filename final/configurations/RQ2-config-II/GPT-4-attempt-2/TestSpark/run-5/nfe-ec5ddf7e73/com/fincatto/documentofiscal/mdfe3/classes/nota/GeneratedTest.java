package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456";
        veiculoReboque.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, veiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC-1234";
        veiculoReboque.setPlaca(placa);
        Assert.assertEquals(placa, veiculoReboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "1234567890";
        veiculoReboque.setRenavam(renavam);
        Assert.assertEquals(renavam, veiculoReboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "1500";
        veiculoReboque.setTara(tara);
        Assert.assertEquals(tara, veiculoReboque.getTara());
    }

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "2000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, veiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "5000";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, veiculoReboque.getCapacidadeM3());
    }

}