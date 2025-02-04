package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetTaraValidation {

    @Test
    public void testSetTaraValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraInvalida = "abcd";
        DFStringValidador.capacidadeNDigitos(taraInvalida, "Tara em reboque", 5);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(taraInvalida, "Tara em reboque", 5));
    }

}