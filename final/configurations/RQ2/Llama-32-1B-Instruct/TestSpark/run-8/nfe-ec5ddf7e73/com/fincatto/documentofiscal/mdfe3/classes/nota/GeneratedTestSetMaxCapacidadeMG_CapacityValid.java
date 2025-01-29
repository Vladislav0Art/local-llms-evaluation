package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetMaxCapacidadeMG_CapacityValid {

    @Test
    public void testSetMaxCapacidadeMG_CapacityValid() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setMaxCapacidadeMG(1);
        assertEquals(1, mockMdf.getSuccess().size());
    }

}