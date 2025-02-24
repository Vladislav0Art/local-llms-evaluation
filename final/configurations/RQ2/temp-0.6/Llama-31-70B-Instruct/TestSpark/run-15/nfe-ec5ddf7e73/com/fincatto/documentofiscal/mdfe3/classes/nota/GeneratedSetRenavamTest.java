package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setRenavam("123456789012345");
        assertEquals("123456789012345", mDFInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}