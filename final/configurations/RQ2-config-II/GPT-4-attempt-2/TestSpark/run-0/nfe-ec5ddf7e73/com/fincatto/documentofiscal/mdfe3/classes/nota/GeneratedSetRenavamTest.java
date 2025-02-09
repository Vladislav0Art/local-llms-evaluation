package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setRenavam("448852731");
        assertEquals("448852731", veiculo.getRenavam());
    }

}