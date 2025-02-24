package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetTaraTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTaraTest() {
        String tara = "tara";
        reboque.setTara(tara);
        Assert.assertEquals(tara, reboque.getTara());
    }

}