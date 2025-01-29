package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCodigoInterno {

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getCodigoInterno(Mockito.anyString())).thenReturn(codigoInterno);
        instance.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

}