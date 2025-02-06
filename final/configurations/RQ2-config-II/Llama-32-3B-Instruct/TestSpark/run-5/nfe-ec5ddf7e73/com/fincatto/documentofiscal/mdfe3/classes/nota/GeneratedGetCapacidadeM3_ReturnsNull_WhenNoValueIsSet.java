package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3_ReturnsNull_WhenNoValueIsSet {

    private final String codigoInterno = "1234567890";
    private final String placa = "ABC-123";
    private final String renavam = "1234567890123";
    private final String tara = "100kg";
    private final String capacidadeKG = "5,000kg";
    private final String capacidadeM3 = "1.500m3";

    @Test
    public void getCapacidadeM3_ReturnsNull_WhenNoValueIsSet() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}