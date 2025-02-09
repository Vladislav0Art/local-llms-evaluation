package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCodigoInterno("123");
        assertEquals("123", veiculo.getCodigoInterno());
    }

}