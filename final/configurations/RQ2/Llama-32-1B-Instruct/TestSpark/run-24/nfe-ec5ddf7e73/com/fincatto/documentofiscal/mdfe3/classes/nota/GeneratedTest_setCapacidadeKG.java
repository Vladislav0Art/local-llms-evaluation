package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCapacidadeKG {

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "200";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(instance.getCapacidadeKG(Mockito.anyString())).thenReturn(capacidadeKG);
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}