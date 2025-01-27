package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaTest2 {

    @Test
    public void setPlacaTest2() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaExpected = "DEF456";
        obj.setPlaca(placaExpected);
        assertEquals(placaExpected, obj.getPlaca());
    }

}