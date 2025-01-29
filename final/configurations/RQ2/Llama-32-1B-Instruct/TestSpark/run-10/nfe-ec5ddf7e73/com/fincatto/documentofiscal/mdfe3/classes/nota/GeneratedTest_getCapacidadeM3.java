package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_getCapacidadeM3 {

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "5m";
        when(dfStringValidador.validate(capacidadeM3)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals("5m", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}