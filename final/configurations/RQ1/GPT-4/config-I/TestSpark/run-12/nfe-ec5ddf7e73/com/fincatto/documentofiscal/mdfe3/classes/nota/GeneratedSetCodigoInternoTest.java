package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        veiculoReboque.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, veiculoReboque.getCodigoInterno());
    }

}