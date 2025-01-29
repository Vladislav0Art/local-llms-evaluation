package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest_setCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque subject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "456.78";
        Mockito.when(subject.getCapacidadeKG(null)).thenReturn(capacidadeKG);
        subject.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, subject.getCapacidadeKG());
    }

}