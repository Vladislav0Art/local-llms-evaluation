package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeMG_CapacityMax {

    @Test
    public void testSetCapacidadeMG_CapacityMax() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeMG(1);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}