package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeKG_ReturnsEmptyString {

    private final String codigoInterno = "CODIGO_INTERNO";
    private final String placa = "PLACA";
    private final String renavam = "RENAVAM";
    private final String tara = "TARA";
    private final String capacidadeKG = "CAPACIDADE_KG";
    private final String capacidadeM3 = "CAPACIDADE_M3";

    @Test
    public void getCapacidadeKG_ReturnsEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String result = obj.getCapacidadeKG();
        assertTrue(result.equals(capacidadeKG));
    }

}