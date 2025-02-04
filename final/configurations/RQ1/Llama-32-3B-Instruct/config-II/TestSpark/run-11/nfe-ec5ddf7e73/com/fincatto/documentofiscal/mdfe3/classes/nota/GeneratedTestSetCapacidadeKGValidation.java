package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetCapacidadeKGValidation {

    @Test
    public void testSetCapacidadeKGValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGBeyondLimit = "200000";
        DFStringValidador.capacidadeNDigitos(capacidadeKGBeyondLimit, "Capacidade em KG reboque", 5);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(capacidadeKGBeyondLimit, "Capacidade em KG reboque", 5));
    }

}