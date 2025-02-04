package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedTestGetCapacidadeKGElement {

    @Test
    public void testGetCapacidadeKGElement() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeKG = "12";
        Element element = Mockito.mock(Element.class);
        when(element.name()).thenReturn("capKG");
        modalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}