package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("abc123");
        Assert.assertEquals("abc123", reboque.getCodigoInterno());
    }

}