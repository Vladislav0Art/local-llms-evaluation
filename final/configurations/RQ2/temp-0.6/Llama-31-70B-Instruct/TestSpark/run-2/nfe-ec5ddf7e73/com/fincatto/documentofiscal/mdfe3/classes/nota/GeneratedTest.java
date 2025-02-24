package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    // Testing setCodigoInterno method

    @Test
    public void setCodigoInternoTest() {
        // Creating an instance of MDFInfoModalRodoviarioVeiculoReboque
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();

        // Calling the method with a valid input
        instance.setCodigoInterno("ValidInput");

        // Asserting that the method works correctly
        Assert.assertEquals("ValidInput", instance.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        // Creating an instance of MDFInfoModalRodoviarioVeiculoReboque
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();

        // Calling the method with a valid input
        instance.setPlaca("ValidInput");

        // Asserting that the method works correctly
        Assert.assertEquals("ValidInput", instance.getPlaca());
    }

}