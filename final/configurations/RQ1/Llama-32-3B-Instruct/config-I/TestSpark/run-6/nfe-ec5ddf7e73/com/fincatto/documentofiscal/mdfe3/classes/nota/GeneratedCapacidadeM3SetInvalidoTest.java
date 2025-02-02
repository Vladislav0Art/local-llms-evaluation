package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCapacidadeM3SetInvalidoTest {

    @Test
    public void capacidadeM3SetInvalidoTest() {
        String capacidadeM3 = "abcdefgh";
        DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2);
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}