package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest_setRenavam_Renavam {

    @Test
    public void test_setRenavam_Renavam() {
        String renavam = "GHI789";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setRenavam(renavam);
        assertEquals(renavam, instance.getRenavam());
    }

}