package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeKG("12345");
        assertEquals("12345", veiculoReboque.getCapacidadeKG());
    }

}