package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCapacidadeKG {

    @Test
    public void testGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "10K";
        assertEquals("10K", modelo.getCapacidadeKG());
    }

}