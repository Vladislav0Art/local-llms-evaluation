package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetAndGetCapacidadeKGTest {

    @Test
    public void setAndGetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacityKG = "7000";
        vehicle.setCapacidadeKG(capacityKG);
        assertEquals(vehicle.getCapacidadeKG(), capacityKG);
    }

}