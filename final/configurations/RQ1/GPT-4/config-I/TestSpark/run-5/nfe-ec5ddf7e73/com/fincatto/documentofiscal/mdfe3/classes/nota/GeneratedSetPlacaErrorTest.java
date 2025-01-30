package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaErrorTest {

    @Test
    public void setPlacaErrorTest() {
        MDFInfoModalRodoviarioVeiculoReboque rodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        rodoviarioVeiculoReboque.setPlaca("12345678");
        Assert.assertEquals("12345678", rodoviarioVeiculoReboque.getPlaca());
    }

}