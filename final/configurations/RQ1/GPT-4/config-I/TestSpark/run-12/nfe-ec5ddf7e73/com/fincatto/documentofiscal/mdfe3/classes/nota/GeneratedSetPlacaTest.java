package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";
        veiculoReboque.setPlaca(placa);
        Assert.assertEquals(placa, veiculoReboque.getPlaca());
    }

}