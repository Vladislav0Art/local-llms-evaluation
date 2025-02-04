package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3_ValidValue {

    @Test
    public void getCapacidadeM3_ValidValue() {
        final String capacidadeM3 = "100";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals(100, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3()));
    }
}

}