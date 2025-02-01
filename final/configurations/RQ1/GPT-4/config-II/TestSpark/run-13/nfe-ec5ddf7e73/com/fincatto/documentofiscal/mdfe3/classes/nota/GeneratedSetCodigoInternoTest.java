package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque infoRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        infoRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", infoRodoviarioVeiculoReboque.getCodigoInterno());
    }

}