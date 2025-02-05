package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "15";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(veiculoReboque.getCapacidadeM3(), capacidadeM3);
    }

}