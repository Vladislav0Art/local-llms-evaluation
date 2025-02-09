package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCapacidadeM3("2345");
        assertEquals("2345", vehicle.getCapacidadeM3());
    }

}