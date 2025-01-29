package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_getCapacidadeKG {

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "10kg";
        when(dfStringValidador.validate(capacidadeKG)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("10kg", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}