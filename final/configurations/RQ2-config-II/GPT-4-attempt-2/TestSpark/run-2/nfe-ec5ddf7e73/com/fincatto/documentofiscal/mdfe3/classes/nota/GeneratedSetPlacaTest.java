package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC1234";
        vehicle.setPlaca(placa);
        Assert.assertEquals(placa, vehicle.getPlaca());
    }

}