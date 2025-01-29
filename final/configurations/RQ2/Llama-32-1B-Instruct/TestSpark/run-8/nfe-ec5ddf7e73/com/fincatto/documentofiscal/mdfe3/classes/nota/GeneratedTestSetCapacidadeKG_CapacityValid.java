package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeKG_CapacityValid {

    @Test
    public void testSetCapacidadeKG_CapacityValid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeKG(1);
        assertEquals(1, mockMdf.getSuccess().size());
    }

}