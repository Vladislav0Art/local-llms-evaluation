package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCapacidadeKGSetInvalidoTest {

    @Test
    public void capacidadeKGSetInvalidoTest() {
        String capacidadeKG = "abcdefgh";
        DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5);
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("1000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}