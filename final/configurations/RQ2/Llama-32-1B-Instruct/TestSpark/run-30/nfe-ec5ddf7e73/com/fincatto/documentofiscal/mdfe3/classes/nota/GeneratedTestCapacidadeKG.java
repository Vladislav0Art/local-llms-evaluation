package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCapacidadeKG {

    @Test
    public void testCapacidadeKG() {
        String capacidadeKG = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, notar.getCapacidadeKG());
    }

}