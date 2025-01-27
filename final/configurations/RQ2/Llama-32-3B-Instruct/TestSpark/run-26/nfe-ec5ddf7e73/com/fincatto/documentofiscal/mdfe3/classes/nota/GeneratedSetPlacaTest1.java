package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaTest1 {

    @Test
    public void setPlacaTest1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaExpected = "ABC123";
        obj.setPlaca(placaExpected);
        assertEquals(placaExpected, obj.getPlaca());
    }

}