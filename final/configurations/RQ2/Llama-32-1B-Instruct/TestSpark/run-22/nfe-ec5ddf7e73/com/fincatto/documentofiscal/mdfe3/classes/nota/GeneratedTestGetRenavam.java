package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetRenavam {

    @Test
    public void testGetRenavam() {
        Element element = Element.builder("renavam").value(" renavam").build();
        assertEquals("renavam", element.getRenavam());
    }

}