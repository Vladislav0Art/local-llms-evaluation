package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeM3_ValidValue_SetsCorrectly {

    @Element(name = "CapacidadeKG")
    private String capacidadeKG;

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    @Test
    public void setCapacidadeM3_ValidValue_SetsCorrectly() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("10.0");
        assertEquals("10.0", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}