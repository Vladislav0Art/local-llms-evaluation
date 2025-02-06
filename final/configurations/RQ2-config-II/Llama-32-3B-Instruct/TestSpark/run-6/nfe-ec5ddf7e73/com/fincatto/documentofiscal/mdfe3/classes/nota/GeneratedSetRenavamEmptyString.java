package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetRenavamEmptyString {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavamEmptyString() {
        modalRodoviarioVeiculoReboque.setRenavam("");
        assertTrue(modalRodoviarioVeiculoReboque.getRenavam().isEmpty());
    }

}