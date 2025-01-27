package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeKGTest3 {

    @Test
    public void getCapacidadeKGTest3() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGExpected = "250kg";
        obj.setCapacidadeKG(capacidadeKGExpected);
        assertEquals(capacidadeKGExpected, obj.getCapacidadeKG());
    }

}