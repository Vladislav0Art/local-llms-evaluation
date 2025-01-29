package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Before;
import org.junit.Test;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedTest_getCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque model;

    @Before
    public void setup() {
        model = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "100";
        Element element = Element.builder("capacidadeKG").name("capacidadeKG").value(capacidadeKG).build();
        model.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, model.getCapacidadeKG());
    }

}