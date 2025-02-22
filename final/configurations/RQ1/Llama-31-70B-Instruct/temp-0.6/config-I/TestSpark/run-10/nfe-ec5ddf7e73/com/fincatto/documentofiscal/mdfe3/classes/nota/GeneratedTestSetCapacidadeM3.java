package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestSetCapacidadeM3 {

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        assertEquals("12", reboque.getCapacidadeM3());
    }

}