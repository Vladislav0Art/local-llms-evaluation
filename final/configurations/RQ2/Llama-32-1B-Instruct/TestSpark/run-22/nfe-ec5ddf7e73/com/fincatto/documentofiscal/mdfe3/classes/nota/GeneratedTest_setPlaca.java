package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_setPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        Element element = Element.builder("placa").name("placa").value(placa).build();
        model.setPlaca(placa);
        assertEquals(placa, model.getPlaca());
    }

}