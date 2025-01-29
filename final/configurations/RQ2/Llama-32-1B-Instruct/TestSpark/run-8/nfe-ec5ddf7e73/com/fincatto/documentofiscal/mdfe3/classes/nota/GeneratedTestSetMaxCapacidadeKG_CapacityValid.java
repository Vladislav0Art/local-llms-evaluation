package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetMaxCapacidadeKG_CapacityValid {

    @Test
    public void testSetMaxCapacidadeKG_CapacityValid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setMaxCapacidadeKG(1);
        assertEquals(1, mockMdf.getSuccess().size());
    }

}