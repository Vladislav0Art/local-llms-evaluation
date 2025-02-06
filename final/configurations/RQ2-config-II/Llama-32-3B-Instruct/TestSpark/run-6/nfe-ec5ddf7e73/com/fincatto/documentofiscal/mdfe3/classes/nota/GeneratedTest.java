package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoEmptyString() {
        modalRodoviarioVeiculoReboque.setCodigoInterno("");
        assertTrue(modalRodoviarioVeiculoReboque.getCodigoInterno().isEmpty());
    }

    @Test
    public void setPlacaEmptyString() {
        modalRodoviarioVeiculoReboque.setPlaca("");
        assertTrue(modalRodoviarioVeiculoReboque.getPlaca().isEmpty());
    }

    @Test
    public void setRenavamEmptyString() {
        modalRodoviarioVeiculoReboque.setRenavam("");
        assertTrue(modalRodoviarioVeiculoReboque.getRenavam().isEmpty());
    }

    @Test
    public void setTaraEmptyString() {
        modalRodoviarioVeiculoReboque.setTara("");
        assertTrue(modalRodoviarioVeiculoReboque.getTara().isEmpty());
    }

    @Test
    public void getCapacidadeKG_RetornarBigDecimalNull() {
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_RetornarBigDecimalNull() {
        modalRodoviarioVeiculoReboque.setCapacidadeKG(null);
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_RetornarBigDecimalNull() {
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_RetornarBigDecimalNull() {
        modalRodoviarioVeiculoReboque.setCapacidadeM3(null);
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}