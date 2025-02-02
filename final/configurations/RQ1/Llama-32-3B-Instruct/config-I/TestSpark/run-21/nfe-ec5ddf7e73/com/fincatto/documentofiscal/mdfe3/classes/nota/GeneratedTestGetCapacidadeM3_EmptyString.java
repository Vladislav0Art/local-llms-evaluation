package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCapacidadeM3_EmptyString {

    @Test
    public void testGetCapacidadeM3_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals("", modal.getCapacidadeM3());
    }

}