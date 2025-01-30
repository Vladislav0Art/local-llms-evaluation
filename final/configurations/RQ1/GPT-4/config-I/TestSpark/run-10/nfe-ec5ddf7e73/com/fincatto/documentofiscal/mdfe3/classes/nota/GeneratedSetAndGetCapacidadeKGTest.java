package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetAndGetCapacidadeKGTest {

    @Test
    public void setAndGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCapacidadeKG("12345");
        Assert.assertEquals("12345", veiculo.getCapacidadeKG());
    }

}