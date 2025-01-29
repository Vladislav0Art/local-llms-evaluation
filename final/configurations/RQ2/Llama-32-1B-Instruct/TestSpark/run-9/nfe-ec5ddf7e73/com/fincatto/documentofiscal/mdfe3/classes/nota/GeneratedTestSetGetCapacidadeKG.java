package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetGetCapacidadeKG {

    @Test
    public void testSetGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10K";
        modelo.setCapacidadeKG(capacidadeKG);
        assertEquals("10K", modelo.getCapacidadeKG());
    }

}