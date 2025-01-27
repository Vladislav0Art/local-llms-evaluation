package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKGTest1 {

    @Test
    public void setCapacidadeKGTest1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGExpected = "200kg";
        obj.setCapacidadeKG(capacidadeKGExpected);
        assertEquals(capacidadeKGExpected, obj.getCapacidadeKG());
    }

}