package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeKG {

    @Test
    public void testSetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "12";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

}