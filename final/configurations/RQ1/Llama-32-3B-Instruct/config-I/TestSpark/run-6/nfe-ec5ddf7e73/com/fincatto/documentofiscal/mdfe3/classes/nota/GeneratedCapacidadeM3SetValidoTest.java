package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCapacidadeM3SetValidoTest {

    @Test
    public void capacidadeM3SetValidoTest() {
        String capacidadeM3 = "10";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}