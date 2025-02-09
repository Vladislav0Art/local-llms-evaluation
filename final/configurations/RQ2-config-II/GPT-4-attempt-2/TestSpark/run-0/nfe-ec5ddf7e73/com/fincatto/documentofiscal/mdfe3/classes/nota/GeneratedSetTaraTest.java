package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setTara("2000");
        assertEquals("2000", veiculo.getTara());
    }

}