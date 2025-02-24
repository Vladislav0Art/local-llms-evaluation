package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCodigoInternoTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "codigoInterno";
        reboque.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

}