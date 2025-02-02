package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCapacidadeKGSetValidoTest {

    @Test
    public void capacidadeKGSetValidoTest() {
        String capacidadeKG = "1000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("1000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}