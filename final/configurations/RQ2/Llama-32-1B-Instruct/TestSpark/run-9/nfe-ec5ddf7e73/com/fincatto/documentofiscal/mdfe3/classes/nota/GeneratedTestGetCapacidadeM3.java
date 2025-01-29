package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCapacidadeM3 {

    @Test
    public void testGetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "50M";
        assertEquals("50M", modelo.getCapacidadeM3());
    }

}