package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_setRenavam {

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        when(dfStringValidador.validate(renavam)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals("DEF456", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}