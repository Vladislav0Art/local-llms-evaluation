package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSetCapacidadeKG {

    @Test
    public void testSetCapacidadeKG() {
        String capacidadeKG = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, notar.getCapacidadeKG());
    }

}