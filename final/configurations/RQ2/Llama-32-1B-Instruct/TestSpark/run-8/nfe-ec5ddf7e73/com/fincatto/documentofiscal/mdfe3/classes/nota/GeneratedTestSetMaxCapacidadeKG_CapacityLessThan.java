package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetMaxCapacidadeKG_CapacityLessThan {

    @Test
    public void testSetMaxCapacidadeKG_CapacityLessThan() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setMaxCapacidadeKG(1);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}