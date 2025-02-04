package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetCapacidadeM3Validation {

    @Test
    public void testSetCapacidadeM3Validation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeMBeyondLimit = "10000";
        DFStringValidador.capacidadeNDigitos(capacidadeMBeyondLimit, "Capacidade em M3 reboque", 2);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(capacidadeMBeyondLimit, "Capacidade em M3 reboque", 2));
    }

}