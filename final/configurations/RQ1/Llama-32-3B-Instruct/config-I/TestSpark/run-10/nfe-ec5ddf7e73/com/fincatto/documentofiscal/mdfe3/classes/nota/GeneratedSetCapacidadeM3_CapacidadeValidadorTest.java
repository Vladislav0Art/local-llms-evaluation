package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetCapacidadeM3_CapacidadeValidadorTest {

    @Test
    public void setCapacidadeM3_CapacidadeValidadorTest() {
        final String capacidadeM3 = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}