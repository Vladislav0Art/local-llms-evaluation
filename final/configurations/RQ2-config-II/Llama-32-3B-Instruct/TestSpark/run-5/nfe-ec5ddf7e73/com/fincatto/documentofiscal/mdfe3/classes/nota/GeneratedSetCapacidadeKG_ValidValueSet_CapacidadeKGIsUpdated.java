package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKG_ValidValueSet_CapacidadeKGIsUpdated {

    private final String codigoInterno = "1234567890";
    private final String placa = "ABC-123";
    private final String renavam = "1234567890123";
    private final String tara = "100kg";
    private final String capacidadeKG = "5,000kg";
    private final String capacidadeM3 = "1.500m3";

    @Test
    public void setCapacidadeKG_ValidValueSet_CapacidadeKGIsUpdated() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}