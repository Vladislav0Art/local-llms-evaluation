package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetPlacaTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlacaTest() {
        String placa = "placa";
        reboque.setPlaca(placa);
        Assert.assertEquals(placa, reboque.getPlaca());
    }

}