package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetCapacidadeM3 {

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "JKL";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, notar.getCapacidadeM3());
    }

}