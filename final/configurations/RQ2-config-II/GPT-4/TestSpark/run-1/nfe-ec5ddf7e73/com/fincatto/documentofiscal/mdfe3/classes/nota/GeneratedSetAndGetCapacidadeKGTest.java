package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetAndGetCapacidadeKGTest {

    @Test
    public void setAndGetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeKG("2000");
        assertNotNull(veiculo.getCapacidadeKG());
        assertEquals(veiculo.getCapacidadeKG(), "2000");
    }

}