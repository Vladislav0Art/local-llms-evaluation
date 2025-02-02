package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetCapacidadeKG_CapacidadeValidadorTest {

    @Test
    public void setCapacidadeKG_CapacidadeValidadorTest() {
        final String capacidadeKG = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}