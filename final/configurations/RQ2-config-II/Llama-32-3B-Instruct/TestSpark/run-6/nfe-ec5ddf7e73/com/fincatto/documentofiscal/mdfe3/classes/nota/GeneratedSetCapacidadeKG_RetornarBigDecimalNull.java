package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_RetornarBigDecimalNull {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeKG_RetornarBigDecimalNull() {
        modalRodoviarioVeiculoReboque.setCapacidadeKG(null);
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}