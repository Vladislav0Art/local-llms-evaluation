package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "2000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(veiculoReboque.getCapacidadeKG(), capacidadeKG);
    }

}