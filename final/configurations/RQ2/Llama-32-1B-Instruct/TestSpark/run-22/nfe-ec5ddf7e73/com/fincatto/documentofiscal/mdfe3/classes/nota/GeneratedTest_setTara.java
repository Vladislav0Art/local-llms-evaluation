package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_setTara {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        Element element = Element.builder("tara").name("tara").value(tara).build();
        model.setTara(tara);
        assertEquals(tara, model.getTara());
    }

}