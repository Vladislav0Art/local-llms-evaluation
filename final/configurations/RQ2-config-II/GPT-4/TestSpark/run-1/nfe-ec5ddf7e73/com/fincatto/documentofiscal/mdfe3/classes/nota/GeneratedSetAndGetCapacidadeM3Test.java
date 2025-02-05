package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetAndGetCapacidadeM3Test {

    @Test
    public void setAndGetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeM3("25");
        assertNotNull(veiculo.getCapacidadeM3());
        assertEquals(veiculo.getCapacidadeM3(), "25");
    }

}