package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKG_ValidValue {

    @Test
    public void setCapacidadeKG_ValidValue() {
        final String capacidadeKG = "500";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals(500, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG()));
    }

}