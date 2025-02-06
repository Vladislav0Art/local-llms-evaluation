package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

public class GeneratedSetTaraEmptyString {

    private MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTaraEmptyString() {
        modalRodoviarioVeiculoReboque.setTara("");
        assertTrue(modalRodoviarioVeiculoReboque.getTara().isEmpty());
    }

}