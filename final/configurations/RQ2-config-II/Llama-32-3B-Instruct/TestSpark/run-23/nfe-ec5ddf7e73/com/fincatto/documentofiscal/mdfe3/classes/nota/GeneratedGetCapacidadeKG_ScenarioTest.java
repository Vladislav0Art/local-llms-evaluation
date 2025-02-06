package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetCapacidadeKG_ScenarioTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeKG_ScenarioTest() {
        final String capacidadeKg = "capacidade_kg";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKg);
        assertEquals(capacidadeKg, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}