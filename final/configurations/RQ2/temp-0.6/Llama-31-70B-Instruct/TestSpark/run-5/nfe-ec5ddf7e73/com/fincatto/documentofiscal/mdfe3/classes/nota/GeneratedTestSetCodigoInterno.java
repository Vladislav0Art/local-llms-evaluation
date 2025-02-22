package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestSetCodigoInterno {

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", mDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}