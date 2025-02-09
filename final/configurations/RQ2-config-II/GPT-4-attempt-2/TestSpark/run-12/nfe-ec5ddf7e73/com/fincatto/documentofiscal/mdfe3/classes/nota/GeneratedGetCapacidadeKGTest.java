package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCapacidadeKG("5000");
        assertEquals("5000", vehicle.getCapacidadeKG());
    }

}