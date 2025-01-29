package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setTara {

    @Test
    public void test_setTara() {
        String tara = "789012";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getTara(Mockito.anyString())).thenReturn(tara);
        instance.setTara(tara);
        assertEquals(tara, instance.getTara());
    }

}