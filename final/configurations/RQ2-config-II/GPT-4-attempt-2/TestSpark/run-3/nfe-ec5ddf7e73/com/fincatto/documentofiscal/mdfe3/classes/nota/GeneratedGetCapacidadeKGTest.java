package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeKG = "5000";
        info.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, info.getCapacidadeKG());
    }

}