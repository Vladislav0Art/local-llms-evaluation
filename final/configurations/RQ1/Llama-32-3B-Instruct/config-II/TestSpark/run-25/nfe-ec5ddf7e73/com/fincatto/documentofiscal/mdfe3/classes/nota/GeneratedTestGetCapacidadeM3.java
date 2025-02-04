package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestGetCapacidadeM3 {

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "50";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("50", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}