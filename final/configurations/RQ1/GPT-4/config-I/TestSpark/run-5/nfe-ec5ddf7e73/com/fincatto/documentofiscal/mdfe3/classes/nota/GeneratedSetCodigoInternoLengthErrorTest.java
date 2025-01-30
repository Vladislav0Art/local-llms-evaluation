package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoLengthErrorTest {

    @Test
    public void setCodigoInternoLengthErrorTest() {
        MDFInfoModalRodoviarioVeiculoReboque rodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        rodoviarioVeiculoReboque.setCodigoInterno("12345678901");
        Assert.assertEquals("12345678901", rodoviarioVeiculoReboque.getCodigoInterno());
    }

}