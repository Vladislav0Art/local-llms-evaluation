package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("12");
        assertEquals("12", veiculoReboque.getCapacidadeM3());
    }

}