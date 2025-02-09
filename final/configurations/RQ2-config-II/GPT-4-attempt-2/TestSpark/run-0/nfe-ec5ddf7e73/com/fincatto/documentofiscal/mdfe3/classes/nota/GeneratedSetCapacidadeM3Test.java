package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeM3("2000");
        assertEquals("2000", veiculo.getCapacidadeM3());
    }

}