package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCodigoInterno("Code123");
        assertNotNull(veiculo.getCodigoInterno());
        assertEquals(veiculo.getCodigoInterno(), "Code123");
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setPlaca("ABC1234");
        assertNotNull(veiculo.getPlaca());
        assertEquals(veiculo.getPlaca(), "ABC1234");
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setRenavam("9876543210");
        assertNotNull(veiculo.getRenavam());
        assertEquals(veiculo.getRenavam(), "9876543210");
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setTara("2500");
        assertNotNull(veiculo.getTara());
        assertEquals(veiculo.getTara(), "2500");
    }

    @Test
    public void setAndGetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeKG("2000");
        assertNotNull(veiculo.getCapacidadeKG());
        assertEquals(veiculo.getCapacidadeKG(), "2000");
    }

    @Test
    public void setAndGetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeM3("25");
        assertNotNull(veiculo.getCapacidadeM3());
        assertEquals(veiculo.getCapacidadeM3(), "25");
    }

}