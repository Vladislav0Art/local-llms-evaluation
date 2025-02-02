package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCapacidadeKG_EmptyString {

    @Test
    public void testGetCapacidadeKG_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "";
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals("", modal.getCapacidadeKG());
    }

}