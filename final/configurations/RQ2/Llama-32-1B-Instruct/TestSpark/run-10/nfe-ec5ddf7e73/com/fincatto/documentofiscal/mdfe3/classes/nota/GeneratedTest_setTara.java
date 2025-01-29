package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_setTara {

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        when(dfStringValidador.validate(tara)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals("GHI789", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}