package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_getCapacidadeM3 {

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "300";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getCapacidadeM3(Mockito.anyString())).thenReturn(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}