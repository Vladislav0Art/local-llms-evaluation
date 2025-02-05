package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(veiculoReboque.getCapacidadeKG(), capacidadeKG);
    }

}