package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3_ValidValueSet_CapacidadeM3IsUpdated {

    private final String codigoInterno = "1234567890";
    private final String placa = "ABC-123";
    private final String renavam = "1234567890123";
    private final String tara = "100kg";
    private final String capacidadeKG = "5,000kg";
    private final String capacidadeM3 = "1.500m3";

    @Test
    public void setCapacidadeM3_ValidValueSet_CapacidadeM3IsUpdated() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}