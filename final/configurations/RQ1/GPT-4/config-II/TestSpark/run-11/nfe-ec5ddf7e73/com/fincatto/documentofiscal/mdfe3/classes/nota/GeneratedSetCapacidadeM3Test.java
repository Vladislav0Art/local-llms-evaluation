package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("10");
        assertEquals("10", veiculoReboque.getCapacidadeM3());
    }

}