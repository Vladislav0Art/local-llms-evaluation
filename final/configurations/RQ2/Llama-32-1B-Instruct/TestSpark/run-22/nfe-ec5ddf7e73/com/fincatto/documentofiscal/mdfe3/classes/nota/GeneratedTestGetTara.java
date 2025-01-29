package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTara {

    @Test
    public void testGetTara() {
        Element element = Element.builder("tara").value(" tara ").build();
        assertEquals("tara", element.getTara());
    }

}