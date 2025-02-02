package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetCapacidadeM3 {

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "12";
        modal.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, modal.getCapacidadeM3());
    }

}