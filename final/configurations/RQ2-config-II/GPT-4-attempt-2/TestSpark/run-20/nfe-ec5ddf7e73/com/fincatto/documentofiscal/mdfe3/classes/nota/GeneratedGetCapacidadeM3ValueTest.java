package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3ValueTest {

    @Test
    public void getCapacidadeM3ValueTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("15");
        assertEquals("15", veiculoReboque.getCapacidadeM3());
    }

}