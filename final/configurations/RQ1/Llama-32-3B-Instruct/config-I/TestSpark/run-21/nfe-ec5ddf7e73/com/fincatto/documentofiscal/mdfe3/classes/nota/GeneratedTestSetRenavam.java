package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetRenavam {

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        modal.setRenavam(renavam);
        assertEquals(renavam, modal.getRenavam());
    }

}