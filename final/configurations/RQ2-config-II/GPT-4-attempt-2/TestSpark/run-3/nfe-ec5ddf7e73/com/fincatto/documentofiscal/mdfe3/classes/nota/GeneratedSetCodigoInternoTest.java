package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String codigoInterno = "123456789";
        info.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, info.getCodigoInterno());
    }

}