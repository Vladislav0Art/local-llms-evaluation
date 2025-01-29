package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setPlaca {

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getPlaca(Mockito.anyString())).thenReturn(placa);
        instance.setPlaca(placa);
        assertEquals(placa, instance.getPlaca());
    }

}