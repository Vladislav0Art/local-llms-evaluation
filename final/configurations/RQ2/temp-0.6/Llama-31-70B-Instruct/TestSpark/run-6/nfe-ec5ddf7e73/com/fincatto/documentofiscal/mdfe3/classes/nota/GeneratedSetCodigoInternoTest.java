package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", veiculoReboque.getCodigoInterno());
    }

}