package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCodigoInternoInValidTest {

    @Test
    public void setCodigoInternoInValidTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        vehiculoReboque.setCodigoInterno("invalidcode1234567890");
    }

}