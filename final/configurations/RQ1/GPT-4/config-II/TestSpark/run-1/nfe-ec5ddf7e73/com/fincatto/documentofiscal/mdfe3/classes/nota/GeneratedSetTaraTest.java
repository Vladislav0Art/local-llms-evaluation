package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setTara("5000");
        assertEquals("5000", veiculoReboque.getTara());
    }

}