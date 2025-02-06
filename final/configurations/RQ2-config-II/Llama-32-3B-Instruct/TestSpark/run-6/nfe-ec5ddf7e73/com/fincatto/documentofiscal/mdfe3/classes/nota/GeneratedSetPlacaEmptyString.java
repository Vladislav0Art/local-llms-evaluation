package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetPlacaEmptyString {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlacaEmptyString() {
        modalRodoviarioVeiculoReboque.setPlaca("");
        assertTrue(modalRodoviarioVeiculoReboque.getPlaca().isEmpty());
    }

}