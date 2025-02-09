package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCodigoInterno("TestCode");
        assertEquals("TestCode", vehicle.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setPlaca("TestPlate");
        assertEquals("TestPlate", vehicle.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setRenavam("TestRenavam");
        assertEquals("TestRenavam", vehicle.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setTara("TestTara");
        assertEquals("TestTara", vehicle.getTara());
    }

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCapacidadeKG("3000");
        assertEquals("3000", vehicle.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCapacidadeM3("5000");
        assertEquals("5000", vehicle.getCapacidadeM3());
    }

}