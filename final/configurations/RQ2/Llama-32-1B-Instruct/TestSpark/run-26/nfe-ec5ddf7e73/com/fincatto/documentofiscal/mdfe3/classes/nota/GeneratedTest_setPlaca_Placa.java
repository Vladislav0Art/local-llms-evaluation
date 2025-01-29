package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest_setPlaca_Placa {

    @Test
    public void test_setPlaca_Placa() {
        String placa = "DEF456";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setPlaca(placa);
        assertEquals(placa, instance.getPlaca());
    }

}