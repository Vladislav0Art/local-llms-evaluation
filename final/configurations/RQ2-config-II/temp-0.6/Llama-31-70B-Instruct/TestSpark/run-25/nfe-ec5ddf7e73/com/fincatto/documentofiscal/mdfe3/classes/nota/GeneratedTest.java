package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoTest() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        assertEquals(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno(), "1234567890");
    }

    @Test
    public void setPlacaTest() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("ABC1234");
        assertEquals(mdfInfoModalRodoviarioVeiculoReboque.getPlaca(), "ABC1234");
    }

}