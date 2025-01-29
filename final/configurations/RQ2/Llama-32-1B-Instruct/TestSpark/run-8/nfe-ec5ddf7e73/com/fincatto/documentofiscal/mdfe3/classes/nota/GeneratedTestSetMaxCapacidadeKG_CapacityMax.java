package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetMaxCapacidadeKG_CapacityMax {

    @Test
    public void testSetMaxCapacidadeKG_CapacityMax() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setMaxCapacidadeKG(1);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}