package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeKG_CapacityInvalid {

    @Test
    public void testSetCapacidadeKG_CapacityInvalid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeKG(2);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}