package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", mDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", mDFInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}