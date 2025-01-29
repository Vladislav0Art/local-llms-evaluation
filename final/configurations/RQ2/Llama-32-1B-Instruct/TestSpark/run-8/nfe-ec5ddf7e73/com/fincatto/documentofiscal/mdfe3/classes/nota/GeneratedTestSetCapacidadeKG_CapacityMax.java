package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeKG_CapacityMax {

    @Test
    public void testSetCapacidadeKG_CapacityMax() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeKG(1);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}