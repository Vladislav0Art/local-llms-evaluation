package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTest {

    @Element(name = "CapacidadeKG")
    private String capacidadeKG;

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    @Test
    public void setCodigoInterno_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavam_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void setTara_MissingValue_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara("");
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void getCapacidadeKG_ReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_ValidValue_SetsCorrectly() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("10.0");
        assertEquals("10.0", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_ReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_ValidValue_SetsCorrectly() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("10.0");
        assertEquals("10.0", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}