package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeM3_ValidString {

    private final String codigoInterno = "CODIGO_INTERNO";
    private final String placa = "PLACA";
    private final String renavam = "RENAVAM";
    private final String tara = "TARA";
    private final String capacidadeKG = "CAPACIDADE_KG";
    private final String capacidadeM3 = "CAPACIDADE_M3";

    @Test
    public void setCapacidadeM3_ValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(obj.getCapacidadeM3().equals(capacidadeM3));
    }

}