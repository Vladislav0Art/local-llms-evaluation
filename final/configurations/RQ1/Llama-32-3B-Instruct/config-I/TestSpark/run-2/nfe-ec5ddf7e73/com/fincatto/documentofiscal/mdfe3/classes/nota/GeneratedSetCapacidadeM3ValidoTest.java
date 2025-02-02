package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeM3ValidoTest {

    @Test
    public void setCapacidadeM3ValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM31ValorValido = "12";
        obj.setCapacidadeM3(capacidadeM31ValorValido);
        assertEquals("Capacidade em M3 reboque", obj.getCapacidadeM3());
    }

}