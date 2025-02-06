package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetTara_MissingValue_EmptyString {

    @Element(name = "CapacidadeKG")
    private String capacidadeKG;

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    @Test
    public void setTara_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}