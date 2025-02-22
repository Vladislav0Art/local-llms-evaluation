package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expected = "DEF123";
        reboque.setPlaca("DEF123");
        String actual = reboque.getPlaca();
        assertEquals(expected, actual);
    }

}