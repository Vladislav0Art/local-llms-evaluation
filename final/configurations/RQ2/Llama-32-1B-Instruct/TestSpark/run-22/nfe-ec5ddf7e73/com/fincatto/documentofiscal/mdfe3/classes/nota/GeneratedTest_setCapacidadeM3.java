package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_setCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "200";
        Element element = Element.builder("capacidadeM3").name("capacidadeM3").value(capacidadeM3).build();
        model.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, model.getCapacidadeM3());
    }

}