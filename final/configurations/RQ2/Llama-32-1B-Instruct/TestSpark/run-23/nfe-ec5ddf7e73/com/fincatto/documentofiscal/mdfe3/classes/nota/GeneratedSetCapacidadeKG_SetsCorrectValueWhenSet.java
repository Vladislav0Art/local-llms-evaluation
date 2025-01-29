package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetCapacidadeKG_SetsCorrectValueWhenSet {

    @Test
    public void setCapacidadeKG_SetsCorrectValueWhenSet() {
        String expected = "100";
        when(MDFInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("expected")).thenReturn(expected);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String result = mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("expected");
        assertEquals(expected, result);
    }

}