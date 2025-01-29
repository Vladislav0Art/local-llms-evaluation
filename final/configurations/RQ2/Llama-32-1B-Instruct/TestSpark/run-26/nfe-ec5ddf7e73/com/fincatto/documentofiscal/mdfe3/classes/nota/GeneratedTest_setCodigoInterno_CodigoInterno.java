package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest_setCodigoInterno_CodigoInterno {

    @Test
    public void test_setCodigoInterno_CodigoInterno() {
        String codigoInterno = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

}