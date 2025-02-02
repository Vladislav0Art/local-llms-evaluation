package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedGetCapacidadeKG_SimpleGetTest {

    @Test
    public void getCapacidadeKG_SimpleGetTest() {
        final String capacidadeKG = "10";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}