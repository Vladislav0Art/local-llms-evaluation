package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_setCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "12345";
        Element element = Element.builder("codigoInterno").name("codigoInterno").build();
        model.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, model.getCodigoInterno());
    }

}