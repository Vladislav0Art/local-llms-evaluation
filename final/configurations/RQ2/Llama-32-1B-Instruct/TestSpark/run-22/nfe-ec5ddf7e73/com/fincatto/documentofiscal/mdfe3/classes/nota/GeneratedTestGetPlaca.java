package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPlaca {

    @Test
    public void testGetPlaca() {
        Element element = Element.builder("placa").value(" placa").build();
        assertEquals("placa", element.getPlaca());
    }

}