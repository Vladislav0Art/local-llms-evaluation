package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "2000";
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, reboque.getCapacidadeM3());
    }

}