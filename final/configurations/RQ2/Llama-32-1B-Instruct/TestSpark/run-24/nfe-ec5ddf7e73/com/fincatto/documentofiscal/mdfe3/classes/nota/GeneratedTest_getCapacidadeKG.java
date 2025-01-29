package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_getCapacidadeKG {

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "100";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getCapacidadeKG(Mockito.anyString())).thenReturn(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}