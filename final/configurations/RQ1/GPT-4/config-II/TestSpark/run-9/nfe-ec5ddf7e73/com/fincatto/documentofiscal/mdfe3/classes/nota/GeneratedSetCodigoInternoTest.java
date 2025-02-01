package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "ABCDE12345";
        reboque.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

}