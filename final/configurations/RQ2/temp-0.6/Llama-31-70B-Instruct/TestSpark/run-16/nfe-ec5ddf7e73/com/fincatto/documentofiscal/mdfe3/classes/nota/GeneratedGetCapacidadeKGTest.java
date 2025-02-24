package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCapacidadeKGTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeKGTest() {
        String capacidadeKG = "capacidadeKG";
        reboque.setCapacidadeKG(capacidadeKG);
        Assert.assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}