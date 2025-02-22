package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestSetPlaca {

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", mDFInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}