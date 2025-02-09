package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCapacidadeM3("3000");
        assertEquals("3000", veiculoReboque.getCapacidadeM3());
    }

}