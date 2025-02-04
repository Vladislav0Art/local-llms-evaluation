package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeKG_ValidValue {

    @Test
    public void getCapacidadeKG_ValidValue() {
        final String capacidadeKG = "500";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals(500, Integer.parseInt(new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG()));
    }

}