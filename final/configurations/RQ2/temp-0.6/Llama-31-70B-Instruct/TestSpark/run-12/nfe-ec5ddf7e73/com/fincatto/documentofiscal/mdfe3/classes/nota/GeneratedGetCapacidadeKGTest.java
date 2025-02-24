package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}