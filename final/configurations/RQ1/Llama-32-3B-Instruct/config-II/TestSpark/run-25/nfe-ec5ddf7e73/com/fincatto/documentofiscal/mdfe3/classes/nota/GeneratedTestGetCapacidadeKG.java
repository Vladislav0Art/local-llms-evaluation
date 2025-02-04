package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestGetCapacidadeKG {

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "10000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}