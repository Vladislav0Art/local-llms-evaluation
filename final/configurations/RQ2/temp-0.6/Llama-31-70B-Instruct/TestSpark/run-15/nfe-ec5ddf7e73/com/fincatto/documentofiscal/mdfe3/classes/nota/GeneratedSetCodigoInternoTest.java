package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno("123456789012345");
        assertEquals("123456789012345", mDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}