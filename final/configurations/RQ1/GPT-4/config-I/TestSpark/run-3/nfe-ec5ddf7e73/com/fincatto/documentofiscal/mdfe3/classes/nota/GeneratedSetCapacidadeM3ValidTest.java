package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeM3ValidTest {

    @Test
    public void setCapacidadeM3ValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setCapacidadeM3("12");
        Assert.assertEquals("12", vehiculoReboque.getCapacidadeM3());
    }

}