package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "MGT456";
        element = Element.builder().name("capacidade_kg").text(capacidadeKG).build();
        when(object.setCapacidadeKG(element)).thenReturn(true);
        object.setCapacidadeKG(capacidadeKG);

        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

}