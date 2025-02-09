package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setPlaca("ABC-1234");
        assertEquals("ABC-1234", veiculo.getPlaca());
    }

}