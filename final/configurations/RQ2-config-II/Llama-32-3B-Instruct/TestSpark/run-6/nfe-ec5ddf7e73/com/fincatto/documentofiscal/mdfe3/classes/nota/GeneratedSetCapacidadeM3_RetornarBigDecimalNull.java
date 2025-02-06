package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeM3_RetornarBigDecimalNull {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeM3_RetornarBigDecimalNull() {
        modalRodoviarioVeiculoReboque.setCapacidadeM3(null);
        assertNull(modalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}