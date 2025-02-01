package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque infoRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        infoRodoviarioVeiculoReboque.setPlaca("ABC1234");
        Assert.assertEquals("ABC1234", infoRodoviarioVeiculoReboque.getPlaca());
    }

}