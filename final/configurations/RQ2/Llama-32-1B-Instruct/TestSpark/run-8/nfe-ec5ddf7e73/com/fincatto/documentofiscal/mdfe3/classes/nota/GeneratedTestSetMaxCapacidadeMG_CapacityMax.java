package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetMaxCapacidadeMG_CapacityMax {

    @Test
    public void testSetMaxCapacidadeMG_CapacityMax() {
        MDFInfoModalRodoviarioVeiculoReboque mockMdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mockMdf.setMaxCapacidadeMG(1);
        assertEquals(0, mockMdf.getSuccess().size());
    }

}