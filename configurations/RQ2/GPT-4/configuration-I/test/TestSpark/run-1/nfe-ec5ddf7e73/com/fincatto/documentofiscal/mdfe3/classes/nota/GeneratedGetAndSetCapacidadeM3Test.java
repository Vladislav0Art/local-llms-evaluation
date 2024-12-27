package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedGetAndSetCapacidadeM3Test {

    @Test
    public void getAndSetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedCapacidadeM3 = "test";
        testObj.setCapacidadeM3(expectedCapacidadeM3);
        Assert.assertEquals(expectedCapacidadeM3, testObj.getCapacidadeM3());
    }

}