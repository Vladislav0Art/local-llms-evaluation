package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetAndGetCapacidadeM3Test {

    @Test
    public void setAndGetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacityM3 = "7500";
        vehicle.setCapacidadeM3(capacityM3);
        assertEquals(vehicle.getCapacidadeM3(), capacityM3);
    }

}