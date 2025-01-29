package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeMG_CapacityInvalid {

    @Test
    public void testSetCapacidadeMG_CapacityInvalid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeMG(2);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}