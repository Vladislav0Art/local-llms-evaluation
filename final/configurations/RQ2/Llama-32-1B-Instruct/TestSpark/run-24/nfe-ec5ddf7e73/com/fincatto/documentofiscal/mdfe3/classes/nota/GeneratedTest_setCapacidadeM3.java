package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCapacidadeM3 {

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "400";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getCapacidadeM3(Mockito.anyString())).thenReturn(capacidadeM3);
        instance.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}