package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaValidInputTest {

    @Test
    public void setPlacaValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AB123CD");
        assertEquals("AB123CD", reboque.getPlaca());
    }

}