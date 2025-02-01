package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCodigoInterno("123456");
        assertEquals("123456", modalRodoviarioReboque.getCodigoInterno());
    }

}