package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setPlaca("ABC1234");
        assertEquals("ABC1234", modalRodoviarioReboque.getPlaca());
    }

}