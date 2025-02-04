package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetRenavamValidation {

    @Test
    public void testSetRenavamValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamInvalido = "1234567890";
        DFStringValidador.placaDeVeiculo(renavamInvalido, "Placa do reboque");
        boolean result = false;
        assertEquals(result, DFStringValidador.placaDeVeiculo(renavamInvalido, "Placa do reboque"));
    }

}