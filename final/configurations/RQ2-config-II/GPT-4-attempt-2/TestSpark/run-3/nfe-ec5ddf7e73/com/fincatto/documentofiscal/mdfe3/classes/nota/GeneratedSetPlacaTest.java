package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String placa = "ABC1234";
        info.setPlaca(placa);
        Assert.assertEquals(placa, info.getPlaca());
    }

}