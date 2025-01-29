package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setRenavam {

    @Test
    public void test_setRenavam() {
        String renavam = "XYZ456";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getRenavam(Mockito.anyString())).thenReturn(renavam);
        instance.setRenavam(renavam);
        assertEquals(renavam, instance.getRenavam());
    }

}