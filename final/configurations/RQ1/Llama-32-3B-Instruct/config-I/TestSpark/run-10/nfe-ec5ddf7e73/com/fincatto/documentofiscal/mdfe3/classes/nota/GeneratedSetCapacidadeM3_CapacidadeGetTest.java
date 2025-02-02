package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetCapacidadeM3_CapacidadeGetTest {

    @Test
    public void setCapacidadeM3_CapacidadeGetTest() {
        final String capacidadeM3 = "10";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, reboque.getCapacidadeM3());
    }

}