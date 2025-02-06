package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetRenavam_ScenarioTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavam_ScenarioTest() {
        final String renavam = "renavam";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}