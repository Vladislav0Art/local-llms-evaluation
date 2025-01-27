package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKGTest2 {

    @Test
    public void setCapacidadeKGTest2() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGExpected = "500kg";
        obj.setCapacidadeKG(capacidadeKGExpected);
        assertEquals(capacidadeKGExpected, obj.getCapacidadeKG());
    }

}