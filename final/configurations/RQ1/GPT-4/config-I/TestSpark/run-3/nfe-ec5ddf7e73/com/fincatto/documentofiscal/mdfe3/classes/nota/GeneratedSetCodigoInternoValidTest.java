package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoValidTest {

    @Test
    public void setCodigoInternoValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", vehiculoReboque.getCodigoInterno());
    }

}