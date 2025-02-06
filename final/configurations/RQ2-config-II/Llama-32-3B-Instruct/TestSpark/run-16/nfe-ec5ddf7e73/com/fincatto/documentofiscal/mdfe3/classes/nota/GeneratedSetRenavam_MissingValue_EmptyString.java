package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetRenavam_MissingValue_EmptyString {

    @Element(name = "CapacidadeKG")
    private String capacidadeKG;

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    @Test
    public void setRenavam_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}