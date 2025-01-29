package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeMG_CapacityValid {

    @Test
    public void testSetCapacidadeMG_CapacityValid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setCapacidadeMG(1);
        assertEquals(1, mockMdf.getSuccess().size());
    }

}