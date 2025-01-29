package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest_setTara_Tara {

    @Test
    public void test_setTara_Tara() {
        String tara = "JKL012";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setTara(tara);
        assertEquals(tara, instance.getTara());
    }

}