package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setCodigoInterno("123");
        assertEquals("123", instance.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setPlaca("ABC-1234");
        assertEquals("ABC-1234", instance.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setRenavam("123456789");
        assertEquals("123456789", instance.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setTara("1000");
        assertEquals("1000", instance.getTara());
    }

    @Test
    public void setAndGetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setCapacidadeKG("5000");
        assertEquals("5000", instance.getCapacidadeKG());
    }

    @Test
    public void setAndGetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setCapacidadeM3("15");
        assertEquals("15", instance.getCapacidadeM3());
    }

}