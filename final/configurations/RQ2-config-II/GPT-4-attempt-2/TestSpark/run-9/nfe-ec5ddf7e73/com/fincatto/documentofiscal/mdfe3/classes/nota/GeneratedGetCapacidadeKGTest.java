package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCapacidadeKG("3000");
        assertEquals("3000", vehicle.getCapacidadeKG());
    }

}