package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3Test1 {

    @Test
    public void getCapacidadeM3Test1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3Expected = "100m3";
        obj.setCapacidadeM3(capacidadeM3Expected);
        assertEquals(capacidadeM3Expected, obj.getCapacidadeM3());
    }

}