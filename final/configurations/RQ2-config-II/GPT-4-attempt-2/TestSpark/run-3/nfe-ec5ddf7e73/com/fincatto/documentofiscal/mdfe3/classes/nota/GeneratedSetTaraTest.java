package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque info = new MDFInfoModalRodoviarioVeiculoReboque();
        final String tara = "2000";
        info.setTara(tara);
        Assert.assertEquals(tara, info.getTara());
    }

}