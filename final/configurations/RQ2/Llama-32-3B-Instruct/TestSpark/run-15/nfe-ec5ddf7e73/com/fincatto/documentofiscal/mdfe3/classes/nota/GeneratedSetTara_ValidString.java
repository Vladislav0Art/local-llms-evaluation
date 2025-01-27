package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetTara_ValidString {

    private final String codigoInterno = "CODIGO_INTERNO";
    private final String placa = "PLACA";
    private final String renavam = "RENAVAM";
    private final String tara = "TARA";
    private final String capacidadeKG = "CAPACIDADE_KG";
    private final String capacidadeM3 = "CAPACIDADE_M3";

    @Test
    public void setTara_ValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara().equals(tara));
    }

}