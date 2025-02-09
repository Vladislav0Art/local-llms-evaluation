package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeM3 = "15";
        info.setCapacidadeM3(capacidadeM3);
        Assert.assertEquals(capacidadeM3, info.getCapacidadeM3());
    }

}