package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedPlaca = "testPlaca";
        testObj.setPlaca(expectedPlaca);
        Assert.assertEquals(expectedPlaca, testObj.getPlaca());
    }

}