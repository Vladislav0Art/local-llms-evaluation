package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_setCapacidadeM3 {

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "10m";
        when(dfStringValidador.validate(capacidadeM3)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals("10m", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}