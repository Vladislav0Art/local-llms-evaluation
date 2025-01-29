package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "NHO012";
        element = Element.builder().name("capacidade_m3").text(capacidadeM3).build();
        when(object.setCapacidadeM3(element)).thenReturn(true);
        object.setCapacidadeM3(capacidadeM3);

        assertEquals(capacidadeM3, object.getCapacidadeM3());
    }

}