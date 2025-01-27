package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3Test3 {

    @Test
    public void setCapacidadeM3Test3() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3Expected = "300m3";
        obj.setCapacidadeM3(capacidadeM3Expected);
        assertEquals(capacidadeM3Expected, obj.getCapacidadeM3());
    }

}