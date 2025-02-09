package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraValidValueTest {

    @Test
    public void setTaraValidValueTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setTara("validTara");
        assertEquals("validTara", veiculoReboque.getTara());
    }

}