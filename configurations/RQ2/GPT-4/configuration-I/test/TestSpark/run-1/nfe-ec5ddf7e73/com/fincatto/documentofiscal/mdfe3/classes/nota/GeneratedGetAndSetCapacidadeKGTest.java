package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedGetAndSetCapacidadeKGTest {

    @Test
    public void getAndSetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedCapacidadeKG = "test";
        testObj.setCapacidadeKG(expectedCapacidadeKG);
        Assert.assertEquals(expectedCapacidadeKG, testObj.getCapacidadeKG());
    }

}