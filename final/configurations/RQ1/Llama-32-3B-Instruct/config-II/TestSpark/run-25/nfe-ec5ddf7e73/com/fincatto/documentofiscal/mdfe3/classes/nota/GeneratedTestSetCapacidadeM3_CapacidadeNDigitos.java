package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetCapacidadeM3_CapacidadeNDigitos {

    @Test
    public void testSetCapacidadeM3_CapacidadeNDigitos() {
        String capacidadeM3 = "50";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("50", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}