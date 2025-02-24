package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "2000";
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, reboque.getCapacidadeM3());
    }

}