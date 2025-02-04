package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetPlacaValidation {

    @Test
    public void testSetPlacaValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaInvalida = "123";
        DFStringValidador.placaDeVeiculo(placaInvalida, "Placa do reboque");
        boolean result = false;
        assertEquals(result, DFStringValidador.placaDeVeiculo(placaInvalida, "Placa do reboque"));
    }

}