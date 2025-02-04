package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetCapacidadeKG_CapacidadeNDigitos {

    @Test
    public void testSetCapacidadeKG_CapacidadeNDigitos() {
        String capacidadeKG = "10000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}