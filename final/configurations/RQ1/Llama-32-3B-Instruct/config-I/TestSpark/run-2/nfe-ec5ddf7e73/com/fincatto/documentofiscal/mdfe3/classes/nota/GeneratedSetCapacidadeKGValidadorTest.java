package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeKGValidadorTest {

    @Test
    public void setCapacidadeKGValidadorTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGGuerraInvalido = "12345";
        obj.setCapacidadeKG(capacidadeKGGuerraInvalido);
        assertTrue("Capacidade KG invalida", DFStringValidador.capacidadeNDigitos(capacidadeKGGuerraInvalido, "Capacidade em KG reboque", 5) == null);
    }

}