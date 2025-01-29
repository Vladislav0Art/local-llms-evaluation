package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_setRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        Element element = Element.builder("renavam").name("renavam").value(renavam).build();
        model.setRenavam(renavam);
        assertEquals(renavam, model.getRenavam());
    }

}