package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedSetPlacaTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlacaTest() {
        String placa = "AAA1234";
        reboque.setPlaca(placa);
        assertEquals(placa, reboque.getPlaca());
    }

}