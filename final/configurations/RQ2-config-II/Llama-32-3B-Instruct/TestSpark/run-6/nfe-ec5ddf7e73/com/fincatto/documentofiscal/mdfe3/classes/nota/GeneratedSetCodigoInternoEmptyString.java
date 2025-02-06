package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetCodigoInternoEmptyString {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoEmptyString() {
        modalRodoviarioVeiculoReboque.setCodigoInterno("");
        assertTrue(modalRodoviarioVeiculoReboque.getCodigoInterno().isEmpty());
    }

}