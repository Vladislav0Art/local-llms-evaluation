package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetGetCapacidadeM3 {

    @Test
    public void testSetGetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "50M";
        modelo.setCapacidadeM3(capacidadeM3);
        assertEquals("50M", modelo.getCapacidadeM3());
    }

}